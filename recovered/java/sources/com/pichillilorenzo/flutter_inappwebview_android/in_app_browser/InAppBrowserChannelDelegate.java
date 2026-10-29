            package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

            import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
            import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
            import io.flutter.plugin.common.MethodChannel;
            import java.util.HashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class InAppBrowserChannelDelegate extends ChannelDelegateImpl {
                public InAppBrowserChannelDelegate(MethodChannel methodChannel) {
/* 1 */             super(methodChannel);
                }

                public void onBrowserCreated() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onBrowserCreated", new HashMap());
                }

                public void onExit() {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 15 */            channel.invokeMethod("onExit", new HashMap());
                }

                public void onMenuItemClicked(InAppBrowserMenuItem inAppBrowserMenuItem) {
/* 1 */             MethodChannel channel = getChannel();
/* 5 */             if (channel == null) {
/* 7 */                 return;
                    }
/* 10 */            HashMap map = new HashMap();
/* 23 */            map.put("id", Integer.valueOf(inAppBrowserMenuItem.getId()));
/* 28 */            channel.invokeMethod("onMenuItemClicked", map);
                }
            }
