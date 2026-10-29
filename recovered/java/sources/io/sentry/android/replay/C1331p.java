            package io.sentry.android.replay;

            import android.graphics.Bitmap;
            import io.sentry.android.core.SentryAndroidOptions;
            import java.io.File;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            import p000.b51;
            import p000.h22;
            import p000.jb1;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.p */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1331p extends b51 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ ReplayIntegration f10568a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Bitmap f10569b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ h22 f10570c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1331p(ReplayIntegration replayIntegration, Bitmap bitmap, h22 h22Var) {
/* 8 */             super(2);
/* 1 */             this.f10568a = replayIntegration;
/* 3 */             this.f10569b = bitmap;
/* 5 */             this.f10570c = h22Var;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) throws IOException {
/* 1 */             C1326k c1326k = (C1326k) obj;
/* 5 */             long jLongValue = ((Number) obj2).longValue();
/* 9 */             c1326k.getClass();
/* 14 */            SentryAndroidOptions sentryAndroidOptions = this.f10568a.f10421d;
/* 16 */            if (sentryAndroidOptions == null) {
/* 143 */               Intrinsics.m6220e("options");
/* 147 */               throw null;
                    }
/* 22 */            sentryAndroidOptions.getSessionReplay().getClass();
/* 25 */            Bitmap bitmap = this.f10569b;
/* 31 */            String str = (String) this.f10570c.f8873a;
/* 33 */            bitmap.getClass();
/* 40 */            if (c1326k.m5015g() != null && !bitmap.isRecycled()) {
/* 49 */                File fileM5015g = c1326k.m5015g();
/* 53 */                if (fileM5015g != null) {
/* 55 */                    fileM5015g.mkdirs();
                        }
/* 81 */                File file = new File(c1326k.m5015g(), jLongValue + ".jpg");
/* 84 */                file.createNewFile();
                        synchronized (bitmap) {
/* 92 */                    if (!bitmap.isRecycled()) {
/* 98 */                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                try {
/* 113 */                           bitmap.compress(Bitmap.CompressFormat.JPEG, c1326k.f10552a.getSessionReplay().f11529f.screenshotQuality, fileOutputStream);
/* 116 */                           fileOutputStream.flush();
/* 119 */                           fileOutputStream.close();
/* 122 */                           c1326k.m5013c(file, jLongValue, str);
                                } catch (Throwable th) {
                                    try {
/* 130 */                               throw th;
                                    } catch (Throwable th2) {
/* 132 */                               jb1.m5754n(fileOutputStream, th);
/* 135 */                               throw th2;
                                    }
                                }
                            }
                        }
                    }
/* 138 */           return Unit.f12910a;
                }
            }
