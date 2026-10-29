            package com.google.android.gms.internal.play_billing;

            import java.util.concurrent.TimeoutException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzfd extends TimeoutException {
                public /* synthetic */ zzfd(String str, zzfe zzfeVar) {
/* 1 */             super(str);
                }

                @Override // java.lang.Throwable
                public final synchronized Throwable fillInStackTrace() {
/* 5 */             setStackTrace(new StackTraceElement[0]);
/* 9 */             return this;
                }
            }
