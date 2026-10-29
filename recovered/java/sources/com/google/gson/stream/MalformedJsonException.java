            package com.google.gson.stream;

            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public final class MalformedJsonException extends IOException {
                private static final long serialVersionUID = 1;

                public MalformedJsonException(String str) {
/* 1 */             super(str);
                }

/* 4 */         public MalformedJsonException(String str, Throwable th) {
/* 5 */             super(str, th);
                }

/* 5 */         public MalformedJsonException(Throwable th) {
/* 6 */             super(th);
                }
            }
