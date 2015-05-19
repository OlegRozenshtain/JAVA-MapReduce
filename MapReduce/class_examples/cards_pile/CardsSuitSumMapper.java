package class_examples.cards_pile;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class CardsSuitSumMapper extends
		Mapper<LongWritable, Text, Text, IntWritable> {
	
	private IntWritable value = new IntWritable();
	private Text suite = new Text();

	public void map(LongWritable key, Text line, Context context)
			throws IOException, InterruptedException {
		
			String card = line.toString();
			
			if( card.matches("(.*) (\\d+)")){
				
				String[]tmp = card.split(" ");
				
				suite.set(tmp[0]);
				value.set(Integer.parseInt(tmp[1]));
				
				context.write(suite, value);
			}
	}
}