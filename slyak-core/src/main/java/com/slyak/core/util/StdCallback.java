package com.slyak.core.util;

/**
 * .
 *
 * @author stormning 2018/4/25
 * @since 1.3.0
 */
public interface StdCallback {
    void processOut(String out);

    void processError(String error);
}
