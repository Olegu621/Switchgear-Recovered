            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.os.Bundle;
            import android.util.Log;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import p000.qa3;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.y */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class AbstractC0461y {

                /* JADX INFO: renamed from: b */
                private final String f5273b;

                /* JADX INFO: renamed from: c */
                private final long f5274c;

                /* JADX INFO: renamed from: e */
                private boolean f5276e;

                /* JADX INFO: renamed from: a */
                private final qa3 f5272a = new qa3("IntegrityDialogWrapper");

                /* JADX INFO: renamed from: d */
                private final Object f5275d = new Object();

                public AbstractC0461y(String str, long j) {
/* 20 */            this.f5273b = str;
/* 22 */            this.f5274c = j;
                }

                /* JADX INFO: renamed from: a */
                public final Task m2503a(Activity activity, int i) {
                    synchronized (this.f5275d) {
                        try {
/* 7 */                     if (this.f5276e) {
/* 13 */                        return Tasks.forResult(0);
                            }
/* 22 */                    this.f5276e = true;
/* 25 */                    qa3 qa3Var = this.f5272a;
/* 31 */                    Object[] objArr = {Integer.valueOf(i)};
/* 44 */                    if (Log.isLoggable("PlayCore", 3)) {
/* 48 */                        qa3.m7754d(qa3Var.f15477a, "checkAndShowDialog(%s)", objArr);
                            } else {
/* 52 */                        qa3Var.getClass();
                            }
/* 57 */                    Bundle bundle = new Bundle();
/* 62 */                    bundle.putInt("dialog.intent.type", i);
/* 69 */                    bundle.putString("package.name", this.f5273b);
/* 74 */                    bundle.putInt("playcore.integrity.version.major", 1);
/* 80 */                    bundle.putInt("playcore.integrity.version.minor", 4);
/* 85 */                    bundle.putInt("playcore.integrity.version.patch", 0);
/* 92 */                    bundle.putLong("request.token.sid", this.f5274c);
/* 95 */                    return mo2454b(activity, bundle);
                        } catch (Throwable th) {
/* 101 */                   throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public abstract Task mo2454b(Activity activity, Bundle bundle);
            }
