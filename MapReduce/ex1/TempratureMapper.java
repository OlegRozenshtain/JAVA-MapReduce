package ex1;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class TempratureMapper extends Mapper<LongWritable, Text, IntWritable, IntWritable> 
{
	private IntWritable vYear = new IntWritable();
	private IntWritable kTemperature = new IntWritable();
	private final static List<Integer> goodQuality = 
			new ArrayList<Integer>(Arrays.asList(0,1,4,5,9));
	
	public void map(LongWritable key, Text value,  Context context) throws IOException, InterruptedException
	{
		String line = value.toString();
		int temprature = Integer.parseInt(line.substring(88, 92));
		int quality = Integer.parseInt(line.substring(92,93));
		
		if((temprature != 9999) && (goodQuality.contains(quality)))
		{
			char sign = line.charAt(87);
			if (sign == '+')
			{
				kTemperature.set(temprature);
			}
			else
			{
				kTemperature.set(-1 * temprature);
			}
			
			vYear.set(Integer.parseInt(line.substring(15, 19)));
			context.write(vYear, kTemperature);
		}
	}
}
