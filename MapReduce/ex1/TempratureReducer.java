package ex1;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.mapreduce.Reducer;

public class TempratureReducer extends Reducer<IntWritable, IntWritable, IntWritable, IntWritable> 
{
	public void reduce(IntWritable key, Iterable<IntWritable> values, Context context) throws IOException, InterruptedException
	{
		int max = values.iterator().next().get();
		
		for(IntWritable val : values)
		{
			if(val.get() > max)
			{
				max = val.get();
			}
		}
		
		context.write(key, new IntWritable(max));
	}

}
