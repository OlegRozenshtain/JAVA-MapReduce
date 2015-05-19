package class_examples.cards_pile;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class CardsSuitSumReducer extends
		Reducer<Text, IntWritable, Text, IntWritable> {

	public void reduce(Text suite, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {
		
		int suiteSum = 0;
		
		for (IntWritable val : values) {
			suiteSum += val.get();
		}
		
		IntWritable sum = new IntWritable(suiteSum);
		
		
		context.write(suite, sum);
	}
}
