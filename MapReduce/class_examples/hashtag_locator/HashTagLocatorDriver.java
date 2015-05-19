package hashtaglocator;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.conf.*;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

// by extending Configures we do not need to create a Configuration object
// by implementing Tool we can use TooRunner to take care of the use of the tool we just created
public class HashTagLocatorDriver extends Configured implements Tool {

	@Override
	public int run(String[] args) throws Exception {

		// make sure the correct amount of arguments was supplied during program execution
		if (args.length != 2) {
			System.err.println("Usage: HashTagLocatorDriver <input path> <outputpath>");
			System.exit(-1);
		}

		// creating a Job object with an empty constructor
		// we let the job know the configuration context by supplying it with the driver class
		Job job = new Job();
		job.setJarByClass(HashTagLocatorDriver.class);
		job.setJobName("Word Count");

		// set which class is responsible for mapping the problem
		// set which class is responsible for reducing the problem
		job.setMapperClass(HashTagLocatorMapper.class);
		job.setReducerClass(HashTagLocatorReducer.class);

		// set the output key and value types
		// the output key of the mapper and reducer is of type Text
		// the output value of the mapper and reducer is of type IntWritable
		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(IntWritable.class);
		
		// set the format of the input and output sources
		// the input is a text file, hence the TextInputFormat as a type (reading from a text file)
		// the output is a text file, hence the TextOutputFormat as a type (writing to a text file)
		job.setInputFormatClass(TextInputFormat.class);
		job.setOutputFormatClass(TextOutputFormat.class);
		
		// after the job is configured, it is time to let it know
		// what is the input source and what is the output destination
		FileInputFormat.addInputPath(job, new Path(args[0]));
		FileOutputFormat.setOutputPath(job, new Path(args[1]));

		// waitForCompletion is the method that executes the task
		// it receives either true of false as a parameter
		// which makes it verbose or quiet respectively
		// the method returns either true or false
		// if it succeeded or failed respectively
		// we keep that value in a variable called success
		boolean success = job.waitForCompletion(true);
		
		// return the success status of the execution
		return success ? 0 : 1;
	}

	public static void main(String[] args) throws Exception {
		
		// create an object of the driver so that the map-reduce task can get executed
		HashTagLocatorDriver driver = new HashTagLocatorDriver();
		
		// ToolRunner.run is a static method that runs the run(String[]) on the 'driver' object
		// and supply it with the 'args' array as a parameter
		// it returns the return value of the run(String[]) method
		int exitCode = ToolRunner.run(driver, args);
		
		// program will finish with either -1(run method), 0, or 1
		System.exit(exitCode);
	}
}