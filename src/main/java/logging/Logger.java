package logging;


/**
 * 内部Logging机制, 本身不实现日志的打印, 同时不依赖于任何第三方日志实现, 而是自动检测classpath下是否有第三方日志实现,
 * 如果有则按照一定的优先级来选择日志实现
 * 
 * @author winflex
 */
public interface Logger {

	/**
	 * 日志打印级别
	 * 
	 * @author winflex
	 * @date 2017年3月15日
	 */
	public static enum LogLevel {

		TRACE,

		DEBUG,

		INFO,

		WARN,

		ERROR
	}

	/**
	 * Return the name of this {@link Logger} instance.
	 *
	 * @return name of this logger instance
	 */
	String name();

	/**
	 * Is the logger instance enabled for the TRACE level?
	 *
	 * @return True if this Logger is enabled for the TRACE level, false
	 *         otherwise.
	 */
	boolean isTraceEnabled();

	/**
	 * Log a message at the TRACE level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	void trace(String msg);

	/**
	 * Log a message at the TRACE level according to the specified format and
	 * argument.
	 * 
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the TRACE level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arg
	 *            the argument
	 */
	void trace(String format, Object arg);

	/**
	 * Log a message at the TRACE level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the TRACE level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param argA
	 *            the first argument
	 * @param argB
	 *            the second argument
	 */
	void trace(String format, Object argA, Object argB);

	/**
	 * Log a message at the TRACE level according to the specified format and
	 * arguments.
	 * 
	 * <p>
	 * This form avoids superfluous string concatenation when the logger is
	 * disabled for the TRACE level. However, this variant incurs the hidden
	 * (and relatively small) cost of creating an {@code Object[]} before
	 * invoking the method, even if this logger is disabled for TRACE. The
	 * variants taking {@link #trace(String, Object) one} and
	 * {@link #trace(String, Object, Object) two} arguments exist solely in
	 * order to avoid this hidden cost.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arguments
	 *            a list of 3 or more arguments
	 */
	void trace(String format, Object... arguments);

	/**
	 * Log an exception (throwable) at the TRACE level with an accompanying
	 * message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	void trace(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the DEBUG level?
	 *
	 * @return True if this Logger is enabled for the DEBUG level, false
	 *         otherwise.
	 */
	boolean isDebugEnabled();

	/**
	 * Log a message at the DEBUG level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	void debug(String msg);

	/**
	 * Log a message at the DEBUG level according to the specified format and
	 * argument.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the DEBUG level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arg
	 *            the argument
	 */
	void debug(String format, Object arg);

	/**
	 * Log a message at the DEBUG level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the DEBUG level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param argA
	 *            the first argument
	 * @param argB
	 *            the second argument
	 */
	void debug(String format, Object argA, Object argB);

	/**
	 * Log a message at the DEBUG level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous string concatenation when the logger is
	 * disabled for the DEBUG level. However, this variant incurs the hidden
	 * (and relatively small) cost of creating an {@code Object[]} before
	 * invoking the method, even if this logger is disabled for DEBUG. The
	 * variants taking {@link #debug(String, Object) one} and
	 * {@link #debug(String, Object, Object) two} arguments exist solely in
	 * order to avoid this hidden cost.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arguments
	 *            a list of 3 or more arguments
	 */
	void debug(String format, Object... arguments);

	/**
	 * Log an exception (throwable) at the DEBUG level with an accompanying
	 * message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	void debug(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the INFO level?
	 *
	 * @return True if this Logger is enabled for the INFO level, false
	 *         otherwise.
	 */
	boolean isInfoEnabled();

	/**
	 * Log a message at the INFO level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	void info(String msg);

	/**
	 * Log a message at the INFO level according to the specified format and
	 * argument.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the INFO level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arg
	 *            the argument
	 */
	void info(String format, Object arg);

	/**
	 * Log a message at the INFO level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the INFO level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param argA
	 *            the first argument
	 * @param argB
	 *            the second argument
	 */
	void info(String format, Object argA, Object argB);

	/**
	 * Log a message at the INFO level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous string concatenation when the logger is
	 * disabled for the INFO level. However, this variant incurs the hidden (and
	 * relatively small) cost of creating an {@code Object[]} before invoking
	 * the method, even if this logger is disabled for INFO. The variants taking
	 * {@link #info(String, Object) one} and
	 * {@link #info(String, Object, Object) two} arguments exist solely in order
	 * to avoid this hidden cost.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arguments
	 *            a list of 3 or more arguments
	 */
	void info(String format, Object... arguments);

	/**
	 * Log an exception (throwable) at the INFO level with an accompanying
	 * message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	void info(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the WARN level?
	 *
	 * @return True if this Logger is enabled for the WARN level, false
	 *         otherwise.
	 */
	boolean isWarnEnabled();

	/**
	 * Log a message at the WARN level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	void warn(String msg);

	/**
	 * Log a message at the WARN level according to the specified format and
	 * argument.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the WARN level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arg
	 *            the argument
	 */
	void warn(String format, Object arg);

	/**
	 * Log a message at the WARN level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous string concatenation when the logger is
	 * disabled for the WARN level. However, this variant incurs the hidden (and
	 * relatively small) cost of creating an {@code Object[]} before invoking
	 * the method, even if this logger is disabled for WARN. The variants taking
	 * {@link #warn(String, Object) one} and
	 * {@link #warn(String, Object, Object) two} arguments exist solely in order
	 * to avoid this hidden cost.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arguments
	 *            a list of 3 or more arguments
	 */
	void warn(String format, Object... arguments);

	/**
	 * Log a message at the WARN level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the WARN level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param argA
	 *            the first argument
	 * @param argB
	 *            the second argument
	 */
	void warn(String format, Object argA, Object argB);

	/**
	 * Log an exception (throwable) at the WARN level with an accompanying
	 * message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	void warn(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the ERROR level?
	 *
	 * @return True if this Logger is enabled for the ERROR level, false
	 *         otherwise.
	 */
	boolean isErrorEnabled();

	/**
	 * Log a message at the ERROR level.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	void error(String msg);

	/**
	 * Log a message at the ERROR level according to the specified format and
	 * argument.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the ERROR level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arg
	 *            the argument
	 */
	void error(String format, Object arg);

	/**
	 * Log a message at the ERROR level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the ERROR level.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param argA
	 *            the first argument
	 * @param argB
	 *            the second argument
	 */
	void error(String format, Object argA, Object argB);

	/**
	 * Log a message at the ERROR level according to the specified format and
	 * arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous string concatenation when the logger is
	 * disabled for the ERROR level. However, this variant incurs the hidden
	 * (and relatively small) cost of creating an {@code Object[]} before
	 * invoking the method, even if this logger is disabled for ERROR. The
	 * variants taking {@link #error(String, Object) one} and
	 * {@link #error(String, Object, Object) two} arguments exist solely in
	 * order to avoid this hidden cost.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arguments
	 *            a list of 3 or more arguments
	 */
	void error(String format, Object... arguments);

	/**
	 * Log an exception (throwable) at the ERROR level with an accompanying
	 * message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	void error(String msg, Throwable t);

	/**
	 * Is the logger instance enabled for the specified {@code level}?
	 *
	 * @return True if this Logger is enabled for the specified {@code level},
	 *         false otherwise.
	 */
	boolean isEnabled(LogLevel level);

	/**
	 * Log a message at the specified {@code level}.
	 *
	 * @param msg
	 *            the message string to be logged
	 */
	void log(LogLevel level, String msg);

	/**
	 * Log a message at the specified {@code level} according to the specified
	 * format and argument.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the specified {@code level}.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arg
	 *            the argument
	 */
	void log(LogLevel level, String format, Object arg);

	/**
	 * Log a message at the specified {@code level} according to the specified
	 * format and arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous object creation when the logger is disabled
	 * for the specified {@code level}.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param argA
	 *            the first argument
	 * @param argB
	 *            the second argument
	 */
	void log(LogLevel level, String format, Object argA, Object argB);

	/**
	 * Log a message at the specified {@code level} according to the specified
	 * format and arguments.
	 * <p/>
	 * <p>
	 * This form avoids superfluous string concatenation when the logger is
	 * disabled for the specified {@code level}. However, this variant incurs
	 * the hidden (and relatively small) cost of creating an {@code Object[]}
	 * before invoking the method, even if this logger is disabled for the
	 * specified {@code level}. The variants taking
	 * {@link #log(LogLevel, String, Object) one} and
	 * {@link #log(LogLevel, String, Object, Object) two} arguments
	 * exist solely in order to avoid this hidden cost.
	 * </p>
	 *
	 * @param format
	 *            the format string
	 * @param arguments
	 *            a list of 3 or more arguments
	 */
	void log(LogLevel level, String format, Object... arguments);

	/**
	 * Log an exception (throwable) at the specified {@code level} with an
	 * accompanying message.
	 *
	 * @param msg
	 *            the message accompanying the exception
	 * @param t
	 *            the exception (throwable) to log
	 */
	void log(LogLevel level, String msg, Throwable t);
}
