package nodebox.node;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * The description provides a helpful text for node users.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface Description {
    String value();
}
