            package p000;

            import android.view.KeyEvent;
            import io.flutter.embedding.android.KeyEmbedderResponder;
            import io.flutter.embedding.android.KeyboardMap;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1331p;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import io.sentry.android.replay.capture.AbstractC1310l;
            import io.sentry.android.replay.capture.C1308j;
            import io.sentry.android.replay.capture.C1312n;
            import java.io.IOException;
            import java.util.Date;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class k31 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12573a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f12574b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f12575c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f12576d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f12577e;

                public /* synthetic */ k31(Object obj, Object obj2, long j, Object obj3, int i) {
/* 1 */             this.f12573a = i;
/* 3 */             this.f12574b = obj;
/* 5 */             this.f12575c = obj2;
/* 7 */             this.f12576d = j;
/* 9 */             this.f12577e = obj3;
                }

                @Override // java.lang.Runnable
                public final void run() throws IOException {
/* 3 */             int i = this.f12573a;
/* 5 */             Object obj = this.f12577e;
/* 7 */             long j = this.f12576d;
/* 9 */             Object obj2 = this.f12575c;
/* 11 */            Object obj3 = this.f12574b;
                    switch (i) {
                        case 0:
/* 1 */                     ((KeyEmbedderResponder) obj3).lambda$synchronizePressingKey$0((KeyboardMap.KeyPair) obj2, j, (KeyEvent) obj);
                            break;
                        case 1:
/* 1 */                     ((KeyEmbedderResponder) obj3).lambda$synchronizePressingKey$1((KeyboardMap.KeyPair) obj2, j, (KeyEvent) obj);
                            break;
                        default:
/* 17 */                    C1312n c1312n = (C1312n) obj3;
/* 19 */                    C1331p c1331p = (C1331p) obj2;
/* 21 */                    C1372x c1372x = (C1372x) obj;
/* 23 */                    C1326k c1326k = c1312n.f10465h;
/* 25 */                    C1554m6 c1554m6 = c1312n.f10498t;
/* 27 */                    if (c1326k != null) {
/* 33 */                        c1331p.invoke(c1326k, Long.valueOf(j));
                            }
/* 48 */                    Date date = (Date) c1312n.f10467j.mo4392a(c1312n, AbstractC1301c.f10457s[1]);
/* 51 */                    if (date == null) {
/* 63 */                        c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
                            } else if (c1312n.f10464g.get()) {
/* 86 */                        c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
                            } else if (c1372x != null) {
/* 109 */                       long jMo4838c = c1312n.f10500v.mo4838c();
/* 127 */                       if (jMo4838c - date.getTime() >= c1554m6.getSessionReplay().f11532i) {
/* 151 */                           AbstractC1310l abstractC1310lM4984c = AbstractC1301c.m4984c(c1312n, c1554m6.getSessionReplay().f11532i, date, c1312n.m4987d(), c1312n.m4988e(), c1372x.f10704b, c1372x.f10703a, c1372x.f10707e, c1372x.f10708f);
/* 157 */                           if (abstractC1310lM4984c instanceof C1308j) {
/* 159 */                               C1308j c1308j = (C1308j) abstractC1310lM4984c;
/* 163 */                               C1308j.m5000a(c1308j, c1312n.f10499u);
/* 171 */                               c1312n.m4994k(c1312n.m4988e() + 1);
/* 178 */                               c1312n.m4995l(c1308j.f10493a.f11214f0);
                                    }
                                }
/* 197 */                       if (jMo4838c - c1312n.f10468k.get() >= c1554m6.getSessionReplay().f11533j) {
/* 203 */                           c1554m6.getReplayController().stop();
/* 216 */                           c1554m6.getLogger().mo4672k(EnumC1553m5.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
                                }
                            } else {
/* 103 */                       c1554m6.getLogger().mo4672k(EnumC1553m5.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
                            }
                            break;
                    }
                }
            }
