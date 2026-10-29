            package io.flutter.plugin.common;

            import io.flutter.Log;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public class ErrorLogResult implements MethodChannel.Result {
                private int level;
                private String tag;

                public ErrorLogResult(String str, int i) {
/* 4 */             this.tag = str;
/* 6 */             this.level = i;
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void error(String str, String str2, Object obj) {
                    String str3;
/* 1 */             if (obj != null) {
/* 13 */                str3 = " details: " + obj;
                    } else {
/* 18 */                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 20 */            int i = this.level;
/* 24 */            if (i < Log.WARN) {
/* 26 */                return;
                    }
/* 44 */            Log.println(i, this.tag, str2 + str3);
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void notImplemented() {
/* 1 */             int i = this.level;
/* 5 */             if (i < Log.WARN) {
/* 7 */                 return;
                    }
/* 12 */            Log.println(i, this.tag, "method not implemented");
                }

                @Override // io.flutter.plugin.common.MethodChannel.Result
                public void success(Object obj) {
                }

/* 8 */         public ErrorLogResult(String str) {
/* 9 */             this(str, Log.WARN);
                }
            }
