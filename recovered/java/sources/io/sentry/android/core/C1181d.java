            package io.sentry.android.core;

            import android.app.Activity;
            import android.graphics.Bitmap;
            import android.graphics.Canvas;
            import android.graphics.Paint;
            import android.media.MediaCodec;
            import android.media.MediaFormat;
            import android.media.MediaMuxer;
            import android.os.Build;
            import android.os.Handler;
            import android.util.SparseIntArray;
            import android.view.Surface;
            import androidx.core.app.FrameMetricsAggregator;
            import io.sentry.C1554m6;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.internal.util.C1218e;
            import io.sentry.android.replay.util.C1357k;
            import io.sentry.android.replay.util.EnumC1355i;
            import io.sentry.android.replay.video.C1360a;
            import io.sentry.android.replay.video.C1361b;
            import io.sentry.android.replay.video.C1362c;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import io.sentry.util.C1709h;
            import java.nio.ByteBuffer;
            import java.util.WeakHashMap;
            import java.util.concurrent.ConcurrentHashMap;
            import kotlin.text.StringsKt;
            import p000.AbstractC0886en;
            import p000.C0908f8;
            import p000.f42;
            import p000.fm0;
            import p000.r51;
            import p000.v51;
            
            /* JADX INFO: renamed from: io.sentry.android.core.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 87 */    public final class C1181d {

                /* JADX INFO: renamed from: a */
                public final Object f9984a;

                /* JADX INFO: renamed from: b */
                public final Object f9985b;

                /* JADX INFO: renamed from: c */
                public final Object f9986c;

                /* JADX INFO: renamed from: d */
                public final Object f9987d;

                /* JADX INFO: renamed from: e */
                public final Object f9988e;

                /* JADX INFO: renamed from: f */
                public final Object f9989f;

                /* JADX INFO: renamed from: g */
                public Object f9990g;

                public C1181d(C1554m6 c1554m6, C1360a c1360a) {
/* 1 */             c1554m6.getClass();
/* 7 */             this.f9984a = c1554m6;
/* 9 */             this.f9985b = c1360a;
/* 11 */            v51 v51Var = v51.f17866b;
/* 40 */            MediaCodec mediaCodecCreateByCodecName = ((Boolean) r51.m8064a(v51Var, C1362c.f10679a).getValue()).booleanValue() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(c1360a.f10672f);
/* 44 */            mediaCodecCreateByCodecName.getClass();
/* 47 */            this.f9986c = mediaCodecCreateByCodecName;
/* 60 */            this.f9987d = r51.m8064a(v51Var, new C0908f8(this, 25));
/* 67 */            this.f9988e = new MediaCodec.BufferInfo();
/* 73 */            String absolutePath = c1360a.f10667a.getAbsolutePath();
/* 77 */            absolutePath.getClass();
/* 86 */            this.f9989f = new C1361b(absolutePath, c1360a.f10670d);
                }

                /* JADX INFO: renamed from: a */
                public void m4776a(Activity activity) {
/* 3 */             C1702a c1702a = (C1702a) this.f9990g;
/* 5 */             c1702a.m5443c();
                    try {
/* 12 */                if (!m4780e()) {
/* 14 */                    c1702a.close();
/* 17 */                    return;
                        }
/* 26 */                m4782g(new RunnableC1173b(this, activity, 0), "FrameMetricsAggregator.add");
/* 29 */                C1176c c1176cM4777b = m4777b();
/* 33 */                if (c1176cM4777b != null) {
/* 39 */                    ((WeakHashMap) this.f9988e).put(activity, c1176cM4777b);
                        }
/* 42 */                c1702a.close();
                    } catch (Throwable th) {
                        try {
/* 47 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 52 */                    th.addSuppressed(th2);
                        }
/* 55 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public C1176c m4777b() {
                    int i;
                    int i2;
                    SparseIntArray sparseIntArray;
/* 5 */             if (!m4780e() || !((Boolean) ((C1708g) this.f9985b).m5471a()).booleanValue()) {
/* 24 */                return null;
                    }
/* 40 */            SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) ((C1708g) this.f9984a).m5471a()).f1234a.f17704b;
/* 43 */            int i3 = 0;
/* 44 */            if (sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
/* 84 */                i = 0;
/* 85 */                i2 = 0;
                    } else {
/* 50 */                int i4 = 0;
/* 51 */                i = 0;
/* 52 */                i2 = 0;
/* 57 */                while (i3 < sparseIntArray.size()) {
/* 59 */                    int iKeyAt = sparseIntArray.keyAt(i3);
/* 63 */                    int iValueAt = sparseIntArray.valueAt(i3);
/* 67 */                    i4 += iValueAt;
/* 70 */                    if (iKeyAt > 700) {
/* 72 */                        i2 += iValueAt;
                            } else if (iKeyAt > 16) {
/* 78 */                        i += iValueAt;
                            }
/* 79 */                    i3++;
                        }
/* 82 */                i3 = i4;
                    }
/* 88 */            return new C1176c(i3, i, i2);
                }

                /* JADX INFO: renamed from: c */
                public void m4778c(boolean z) {
                    ByteBuffer byteBuffer;
/* 3 */             C1361b c1361b = (C1361b) this.f9989f;
/* 7 */             MediaCodec.BufferInfo bufferInfo = (MediaCodec.BufferInfo) this.f9988e;
/* 11 */            MediaCodec mediaCodec = (MediaCodec) this.f9986c;
/* 15 */            C1554m6 c1554m6 = (C1554m6) this.f9984a;
/* 24 */            if (c1554m6.getSessionReplay().f11536m) {
/* 53 */                c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
                    }
/* 56 */            if (z) {
/* 64 */                if (c1554m6.getSessionReplay().f11536m) {
/* 76 */                    c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: sending EOS to encoder", new Object[0]);
                        }
/* 79 */                mediaCodec.signalEndOfInputStream();
                    }
/* 82 */            ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
                    while (true) {
/* 89 */                int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
/* 94 */                if (iDequeueOutputBuffer == -1) {
/* 96 */                    if (!z) {
/* 378 */                       return;
                            }
/* 106 */                   if (c1554m6.getSessionReplay().f11536m) {
/* 118 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                            }
                        } else if (iDequeueOutputBuffer == -3) {
/* 125 */                   outputBuffers = mediaCodec.getOutputBuffers();
                        } else if (iDequeueOutputBuffer == -2) {
/* 135 */                   if (c1361b.f10675c) {
/* 194 */                       f42.m3663s("format changed twice");
/* 197 */                       return;
                            }
/* 137 */                   MediaFormat outputFormat = mediaCodec.getOutputFormat();
/* 141 */                   outputFormat.getClass();
/* 150 */                   if (c1554m6.getSessionReplay().f11536m) {
/* 174 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                            }
/* 177 */                   MediaMuxer mediaMuxer = c1361b.f10674b;
/* 183 */                   c1361b.f10676d = mediaMuxer.addTrack(outputFormat);
/* 185 */                   mediaMuxer.start();
/* 189 */                   c1361b.f10675c = true;
                        } else if (iDequeueOutputBuffer < 0) {
/* 206 */                   if (c1554m6.getSessionReplay().f11536m) {
/* 222 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3781g(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                            }
                        } else {
/* 227 */                   if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
/* 387 */                       f42.m3663s(AbstractC0886en.m3505i(iDequeueOutputBuffer, "encoderOutputBuffer ", " was null"));
/* 390 */                       return;
                            }
/* 237 */                   if ((bufferInfo.flags & 2) != 0) {
/* 245 */                       if (c1554m6.getSessionReplay().f11536m) {
/* 257 */                           c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                                }
/* 260 */                       bufferInfo.size = 0;
                            }
/* 264 */                   if (bufferInfo.size != 0) {
/* 268 */                       if (!c1361b.f10675c) {
/* 328 */                           f42.m3663s("muxer hasn't started");
/* 331 */                           return;
                                }
/* 270 */                       long j = c1361b.f10673a;
/* 272 */                       int i = c1361b.f10677e;
/* 276 */                       c1361b.f10677e = i + 1;
/* 279 */                       long j2 = j * ((long) i);
/* 280 */                       c1361b.f10678f = j2;
/* 282 */                       bufferInfo.presentationTimeUs = j2;
/* 288 */                       c1361b.f10674b.writeSampleData(c1361b.f10676d, byteBuffer, bufferInfo);
/* 297 */                       if (c1554m6.getSessionReplay().f11536m) {
/* 322 */                           c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3786l(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                                }
                            }
/* 332 */                   mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
/* 339 */                   if ((bufferInfo.flags & 4) != 0) {
/* 347 */                       if (c1554m6.getSessionReplay().f11536m) {
/* 349 */                           if (z) {
/* 375 */                               c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
/* 378 */                               return;
                                    } else {
/* 361 */                               c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
/* 364 */                               return;
                                    }
                                }
/* 378 */                       return;
                            }
                        }
                    }
                }

                /* JADX WARN: Code duplicated, block: B:14:0x003d  */
                /* JADX WARN: Code duplicated, block: B:15:0x003f  */
                /* JADX WARN: Code duplicated, block: B:17:0x0045  */
                /* JADX INFO: renamed from: d */
                public void m4779d(Bitmap bitmap) {
                    Surface surface;
                    Canvas canvasLockCanvas;
/* 1 */             String str = Build.MANUFACTURER;
/* 3 */             str.getClass();
/* 14 */            if (StringsKt.m6240z(str, "xiaomi", true) || StringsKt.m6240z(str, "motorola", true)) {
/* 66 */                surface = (Surface) this.f9990g;
/* 68 */                if (surface != null) {
/* 70 */                    canvasLockCanvas = surface.lockCanvas(null);
                        } else {
/* 62 */                    canvasLockCanvas = null;
                        }
                    } else {
/* 24 */                EnumC1355i enumC1355i = EnumC1355i.SOC_MANUFACTURER;
/* 36 */                if (C1357k.m5041a(enumC1355i).equalsIgnoreCase("spreadtrum") || C1357k.m5041a(enumC1355i).equalsIgnoreCase("unisoc")) {
/* 66 */                    surface = (Surface) this.f9990g;
/* 68 */                    if (surface != null) {
/* 70 */                        canvasLockCanvas = surface.lockCanvas(null);
                            } else {
/* 62 */                        canvasLockCanvas = null;
                            }
                        } else {
/* 53 */                    Surface surface2 = (Surface) this.f9990g;
/* 55 */                    if (surface2 != null) {
/* 57 */                        canvasLockCanvas = surface2.lockHardwareCanvas();
                            } else {
/* 62 */                        canvasLockCanvas = null;
                            }
                        }
                    }
/* 74 */            if (canvasLockCanvas != null) {
/* 77 */                canvasLockCanvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    }
/* 82 */            Surface surface3 = (Surface) this.f9990g;
/* 84 */            if (surface3 != null) {
/* 86 */                surface3.unlockCanvasAndPost(canvasLockCanvas);
                    }
/* 90 */            m4778c(false);
                }

                /* JADX INFO: renamed from: e */
                public boolean m4780e() {
/* 3 */             SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f9986c;
                    return ((Boolean) ((C1708g) this.f9985b).m5471a()).booleanValue() && sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
                }

                /* JADX INFO: renamed from: f */
                public void m4781f() {
/* 3 */             MediaCodec mediaCodec = (MediaCodec) this.f9986c;
                    try {
/* 6 */                 m4778c(true);
/* 9 */                 mediaCodec.stop();
/* 12 */                mediaCodec.release();
/* 17 */                Surface surface = (Surface) this.f9990g;
/* 19 */                if (surface != null) {
/* 21 */                    surface.release();
                        }
/* 29 */                C1361b c1361b = (C1361b) this.f9989f;
/* 31 */                MediaMuxer mediaMuxer = c1361b.f10674b;
/* 35 */                if (c1361b.f10675c) {
/* 37 */                    mediaMuxer.stop();
                        }
/* 40 */                mediaMuxer.release();
                    } catch (Throwable th) {
/* 56 */                ((C1554m6) this.f9984a).getLogger().mo4671d(EnumC1553m5.DEBUG, "Failed to properly release video encoder", th);
                    }
                }

                /* JADX INFO: renamed from: g */
                public void m4782g(Runnable runnable, String str) {
                    try {
/* 7 */                 if (C1218e.f10157a.mo4842c()) {
/* 9 */                     runnable.run();
/* 12 */                    return;
                        }
/* 15 */                C1248o0 c1248o0 = (C1248o0) this.f9989f;
/* 27 */                ((Handler) c1248o0.f10226a).post(new RunnableC1192g1(1, this, runnable, str));
                    } catch (Throwable unused) {
/* 31 */                if (str != null) {
/* 52 */                    ((SentryAndroidOptions) this.f9986c).getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        }
                    }
                }

/* 88 */        public C1181d(C1709h c1709h, SentryAndroidOptions sentryAndroidOptions) {
/* 89 */            C1248o0 c1248o0 = new C1248o0(3);
/* 91 */            this.f9987d = new ConcurrentHashMap();
/* 92 */            this.f9988e = new WeakHashMap();
/* 95 */            this.f9990g = new C1702a();
/* 98 */            this.f9985b = new C1708g(new C1195h1(c1709h, sentryAndroidOptions.getLogger()));
/* 99 */            this.f9984a = new C1708g(new C1697u2(8));
/* 100 */           this.f9986c = sentryAndroidOptions;
/* 101 */           this.f9989f = c1248o0;
                }
            }
