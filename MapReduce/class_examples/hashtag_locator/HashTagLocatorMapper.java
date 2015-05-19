package hashtaglocator;

import java.io.IOException;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class HashTagLocatorMapper extends
	// Mapper<KEYIN,VALUEIN,KEYOUT,VALUEOUT>
	// and put(out) a TEXTUAL hashtag and the NUMBER of it's occurrences
	Mapper<LongWritable, Text, Text, IntWritable> {

	// create a static IntWritable named one as a constant
	private final static IntWritable one = new IntWritable(1);
	
	// creating a Text object to work on - this will be the output of the mapper
	private Text word = new Text();

	// the method map is a product of the extension of class Mapper
	// it can get created automatically with this signature as it is 
	// derived from the generic definition of the Mapper
	// the key is the ID, the value is line of text from the file
	// and the context is a reference that enables us to interact
	// with the framework in a way that what we write to the context object
	// will be collected for reducing automatically
	@Override
	public void map(LongWritable key, Text value, Context context)
			throws IOException, InterruptedException {

		// work on Text.value as a String - we get a line of text each time
		String line = value.toString();
		
		// convert String.line to a char array in order to iterate over the characters
		char[] lineAsArray = line.toCharArray();
		
		// iterate over the array
		for (int i = 0; i < lineAsArray.length; i++) {
			
			// skip the char if it is not a hashtag
			// if it is a hashtag and it is within the range, start processing
			// (hashtag as the last character of the line is not a proper hashtag to fetch)
			if (lineAsArray[i] == '#' && i<lineAsArray.length-1) {
				// create a stringbuffer in order to build the hashtag and put # as the first character
				StringBuffer tag = new StringBuffer("#");
				i++;
				
				// as long as we are within the range of the array and
				// the next character after the # is not a space nor a #...
				// it means we are iterating through a proper hashtag
				while (i<lineAsArray.length && lineAsArray[i] != ' ' && lineAsArray[i]!='#') {
					tag.append(lineAsArray[i]);
					i++;	
				}
				
				// after we finished the iteration over the hashtag, 
				// we need to check if the tag is not just a #
				// (it can be a # if the the condition of the while loop did not evaluate as true)
				// if it isn't a # hashtag only, it means it is a proper one and
				// we would like to write it in the context to get collected for reducing
				if(!tag.toString().equals("#")) {
					word.set(tag.toString());
					context.write(word, one);
				}
				
				// in case we encountered one of the situations:
				// 1. ##hashtag
				// 2. #properhashtag#anotherproperhashtag
				// and we are in range, we would like to rollback one index
				// so that the 2nd hashtag will get a chance to evaluate as a proper one
				if (i < lineAsArray.length-1) {
					if(lineAsArray[i] == '#') {						
						i--;
					}
				}
			}
		}
	}
}