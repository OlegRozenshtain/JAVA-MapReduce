package hashtaglocator;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class HashTagLocatorReducer extends
	// Reducer<KEYIN,VALUEIN,KEYOUT,VALUEOUT>
	// the reducers get(in) a TEXTUAL hashtag (the output key of the mapper)
	// and a group of NUMBERS
	// and put(out) the TEXTUAL hashtag and the SUM of the occurrences in the array
	Reducer<Text, IntWritable, Text, IntWritable> {

	// the method reduce is a product of the extension of class Reducer
	// it can get created automatically with this signature as it is 
	// derived from the generic definition of the Reducer
	// the key is the hashtag from the mapper, the values are the group of 1's that were collected
	// and the context is a reference that enables us to interact
	// with the framework in a way that what we write to the context object
	// will be output to the output file as a result
	@Override
	public void reduce(Text key, Iterable<IntWritable> values, Context context)
			throws IOException, InterruptedException {

		// summing up the 1's, sum start in 0
		int sum = 0;
		
		// iterate through the Iterable object and increase the sum in each iteration
		for (IntWritable val : values) {
			sum += val.get();
		}
		
		// write to the context so that final grouping will be made
		// and results will be written to the output file
		context.write(key, new IntWritable(sum));
	}
}