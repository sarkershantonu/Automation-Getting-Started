package org.automation.ui.forms;

import org.automation.ui.UiBase;

/**
 * Created by shantonu on 7/7/16.
 */
public class Connection extends UiBase {

    public class Data extends UiBase{}
    public class Proxy extends UiBase{}
    public class Telnet extends UiBase{}
    public class Rlogin extends UiBase{}
    public class SSH extends UiBase{
        public class Kex extends UiBase{}
        public class Auth extends UiBase{
            public class GSSAPI extends UiBase{}
        }
        public class TTY extends UiBase{}
        public class X11 extends UiBase{}
        public class Tunnels extends UiBase{}
        public class Bugs extends UiBase{}
    }
    public class Serial extends UiBase{}
}
