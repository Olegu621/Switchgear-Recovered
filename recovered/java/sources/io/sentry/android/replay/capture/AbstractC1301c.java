            package io.sentry.android.replay.capture;

            import android.view.MotionEvent;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1567n6;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.core.internal.tombstone.C1212b;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1331p;
            import io.sentry.android.replay.C1372x;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.protocol.C1626w;
            import io.sentry.rrweb.C1652g;
            import io.sentry.rrweb.C1653h;
            import io.sentry.rrweb.C1654i;
            import io.sentry.rrweb.EnumC1651f;
            import io.sentry.transport.InterfaceC1680f;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.Date;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.ConcurrentLinkedDeque;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicLong;
            import kotlin.collections.C1839a;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1983o;
            import p000.C2122qw;
            import p000.C2270uw;
            import p000.j22;
            import p000.t60;
            import p000.u21;
            import p000.yk1;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC1301c {

                /* JADX INFO: renamed from: s */
                public static final /* synthetic */ u21[] f10457s;

                /* JADX INFO: renamed from: a */
                public final C1554m6 f10458a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC1389c1 f10459b;

                /* JADX INFO: renamed from: c */
                public final InterfaceC1680f f10460c;

                /* JADX INFO: renamed from: d */
                public final ScheduledExecutorService f10461d;

                /* JADX INFO: renamed from: e */
                public final ScheduledExecutorService f10462e;

                /* JADX INFO: renamed from: f */
                public final C1212b f10463f;

                /* JADX INFO: renamed from: g */
                public final AtomicBoolean f10464g;

                /* JADX INFO: renamed from: h */
                public C1326k f10465h;

                /* JADX INFO: renamed from: i */
                public final C1300b f10466i;

                /* JADX INFO: renamed from: j */
                public final C1300b f10467j;

                /* JADX INFO: renamed from: k */
                public final AtomicLong f10468k;

                /* JADX INFO: renamed from: l */
                public final C1300b f10469l;

                /* JADX INFO: renamed from: m */
                public final C1300b f10470m;

                /* JADX INFO: renamed from: n */
                public final C1300b f10471n;

                /* JADX INFO: renamed from: o */
                public final C1300b f10472o;

                /* JADX INFO: renamed from: p */
                public final ConcurrentLinkedDeque f10473p;

                /* JADX INFO: renamed from: q */
                public final Object f10474q;

                /* JADX INFO: renamed from: r */
                public final ArrayList f10475r;

                static {
/* 9 */             yk1 yk1Var = new yk1(AbstractC1301c.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;");
/* 14 */            j22.f12033a.getClass();
/* 83 */            f10457s = new u21[]{yk1Var, new yk1(AbstractC1301c.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;"), new yk1(AbstractC1301c.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;"), new yk1(AbstractC1301c.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;"), new yk1(AbstractC1301c.class, "currentSegment", "getCurrentSegment()I"), new yk1(AbstractC1301c.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;")};
                }

                public AbstractC1301c(C1554m6 c1554m6, InterfaceC1389c1 interfaceC1389c1, InterfaceC1680f interfaceC1680f, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2) {
/* 1 */             c1554m6.getClass();
/* 4 */             interfaceC1680f.getClass();
/* 7 */             scheduledExecutorService.getClass();
/* 10 */            scheduledExecutorService2.getClass();
/* 16 */            this.f10458a = c1554m6;
/* 18 */            this.f10459b = interfaceC1389c1;
/* 20 */            this.f10460c = interfaceC1680f;
/* 22 */            this.f10461d = scheduledExecutorService;
/* 24 */            this.f10462e = scheduledExecutorService2;
/* 28 */            interfaceC1680f.getClass();
/* 31 */            C1212b c1212b = new C1212b();
/* 34 */            c1212b.f10129c = interfaceC1680f;
/* 43 */            c1212b.f10130d = new LinkedHashMap(10);
/* 45 */            this.f10463f = c1212b;
/* 53 */            this.f10464g = new AtomicBoolean(false);
/* 61 */            this.f10466i = new C1300b(this, this, 3);
/* 69 */            this.f10467j = new C1300b(this, this, 4);
/* 76 */            this.f10468k = new AtomicLong();
/* 84 */            this.f10469l = new C1300b(this, this, 5);
/* 93 */            this.f10470m = new C1300b(C1626w.f11478b, this, this);
/* 101 */           this.f10471n = new C1300b(this, this, 1);
/* 109 */           this.f10472o = new C1300b(this, this, 2);
/* 116 */           this.f10473p = new ConcurrentLinkedDeque();
/* 123 */           this.f10474q = new Object();
/* 130 */           this.f10475r = new ArrayList();
                }

                /* JADX INFO: renamed from: c */
                public static AbstractC1310l m4984c(AbstractC1301c abstractC1301c, long j, Date date, C1626w c1626w, int i, int i2, int i3, int i4, int i5) {
                    List listM6192K;
/* 3 */             C1300b c1300b = abstractC1301c.f10472o;
/* 5 */             u21[] u21VarArr = f10457s;
/* 15 */            EnumC1567n6 enumC1567n6 = (EnumC1567n6) c1300b.mo4392a(abstractC1301c, u21VarArr[5]);
/* 17 */            C1326k c1326k = abstractC1301c.f10465h;
/* 30 */            String str = (String) abstractC1301c.f10469l.mo4392a(abstractC1301c, u21VarArr[2]);
/* 32 */            ConcurrentLinkedDeque concurrentLinkedDeque = abstractC1301c.f10473p;
/* 34 */            c1626w.getClass();
/* 37 */            enumC1567n6.getClass();
/* 40 */            concurrentLinkedDeque.getClass();
                    synchronized (abstractC1301c.f10474q) {
/* 48 */                listM6192K = CollectionsKt.m6192K(abstractC1301c.f10475r);
/* 54 */                abstractC1301c.f10475r.clear();
                    }
/* 82 */            return C1307i.m4999a(abstractC1301c.f10459b, abstractC1301c.f10458a, j, date, c1626w, i, i2, i3, enumC1567n6, c1326k, i4, i5, str, null, concurrentLinkedDeque, listM6192K);
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo4985a(boolean z, C1983o c1983o);

                /* JADX INFO: renamed from: b */
                public abstract AbstractC1301c mo4986b();

                /* JADX INFO: renamed from: d */
                public final C1626w m4987d() {
/* 12 */            return (C1626w) this.f10470m.mo4392a(this, f10457s[3]);
                }

                /* JADX INFO: renamed from: e */
                public final int m4988e() {
/* 14 */            return ((Number) this.f10471n.mo4392a(this, f10457s[4])).intValue();
                }

                /* JADX INFO: renamed from: f */
                public final C1372x m4989f() {
/* 12 */            return (C1372x) this.f10466i.mo4392a(this, f10457s[0]);
                }

                /* JADX INFO: renamed from: g */
                public abstract void mo4990g(C1372x c1372x);

                /* JADX INFO: renamed from: h */
                public abstract void mo4991h(C1331p c1331p);

                /* JADX WARN: Code duplicated, block: B:16:0x0031  */
                /* JADX WARN: Code duplicated, block: B:47:0x0161  */
                /* JADX WARN: Code duplicated, block: B:50:0x0172  */
                /* JADX WARN: Code duplicated, block: B:51:0x01a0  */
                /* JADX WARN: Code duplicated, block: B:54:0x01b1  */
                /* JADX INFO: renamed from: i */
                public void mo4992i(MotionEvent motionEvent) {
                    int pointerId;
                    int iFindPointerIndex;
                    List listM6210b;
                    List list;
                    int pointerId2;
                    int iFindPointerIndex2;
                    List listM6210b2;
                    long j;
                    List listM6210b3;
/* 5 */             C1372x c1372xM4989f = m4989f();
/* 9 */             if (c1372xM4989f != null) {
/* 11 */                float f = c1372xM4989f.f10706d;
/* 13 */                float f2 = c1372xM4989f.f10705c;
/* 15 */                C1212b c1212b = this.f10463f;
/* 19 */                InterfaceC1680f interfaceC1680f = (InterfaceC1680f) c1212b.f10129c;
/* 23 */                LinkedHashMap linkedHashMap = (LinkedHashMap) c1212b.f10130d;
/* 25 */                int actionMasked = motionEvent.getActionMasked();
/* 29 */                int i = 10;
/* 31 */                int i2 = -1;
/* 33 */                if (actionMasked == 0) {
/* 421 */                   pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 425 */                   iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
/* 430 */                   if (iFindPointerIndex != -1) {
/* 50 */                        list = null;
                            } else {
/* 445 */                       linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
/* 450 */                       C1652g c1652g = new C1652g();
/* 457 */                       c1652g.f11589b = interfaceC1680f.mo4838c();
/* 464 */                       c1652g.f11595f = motionEvent.getX(iFindPointerIndex) * f2;
/* 471 */                       c1652g.f11596i = motionEvent.getY(iFindPointerIndex) * f;
/* 474 */                       c1652g.f11594e = 0;
/* 476 */                       c1652g.f11598w = pointerId;
/* 480 */                       c1652g.f11593d = EnumC1651f.TouchStart;
/* 482 */                       listM6210b = C1839a.m6210b(c1652g);
                            }
                        } else if (actionMasked == 1) {
/* 358 */                   pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 362 */                   iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
/* 367 */                   if (iFindPointerIndex2 != -1) {
/* 50 */                        list = null;
                            } else {
/* 375 */                       linkedHashMap.remove(Integer.valueOf(pointerId2));
/* 380 */                       C1652g c1652g2 = new C1652g();
/* 387 */                       c1652g2.f11589b = interfaceC1680f.mo4838c();
/* 394 */                       c1652g2.f11595f = motionEvent.getX(iFindPointerIndex2) * f2;
/* 401 */                       c1652g2.f11596i = motionEvent.getY(iFindPointerIndex2) * f;
/* 404 */                       c1652g2.f11594e = 0;
/* 406 */                       c1652g2.f11598w = pointerId2;
/* 410 */                       c1652g2.f11593d = EnumC1651f.TouchEnd;
/* 412 */                       listM6210b2 = C1839a.m6210b(c1652g2);
                            }
                        } else if (actionMasked == 2) {
/* 95 */                    long jMo4838c = interfaceC1680f.mo4838c();
/* 99 */                    long j2 = c1212b.f10128b;
/* 101 */                   long j3 = 0;
/* 105 */                   if (j2 == 0 || j2 + 50 <= jMo4838c) {
/* 116 */                       c1212b.f10128b = jMo4838c;
/* 118 */                       Set<Integer> setKeySet = linkedHashMap.keySet();
/* 122 */                       setKeySet.getClass();
/* 133 */                       for (Integer num : setKeySet) {
/* 141 */                           num.getClass();
/* 148 */                           int iFindPointerIndex3 = motionEvent.findPointerIndex(num.intValue());
/* 152 */                           if (iFindPointerIndex3 == i2) {
/* 154 */                               j = j3;
                                    } else {
/* 157 */                               j = j3;
/* 163 */                               if (c1212b.f10127a == j) {
/* 165 */                                   c1212b.f10127a = jMo4838c;
                                        }
/* 167 */                               Object obj = linkedHashMap.get(num);
/* 171 */                               obj.getClass();
/* 178 */                               C1653h c1653h = new C1653h();
/* 186 */                               c1653h.f11600b = motionEvent.getX(iFindPointerIndex3) * f2;
/* 193 */                               c1653h.f11601c = motionEvent.getY(iFindPointerIndex3) * f;
/* 196 */                               c1653h.f11599a = 0;
/* 202 */                               c1653h.f11602d = jMo4838c - c1212b.f10127a;
/* 204 */                               ((Collection) obj).add(c1653h);
                                    }
/* 207 */                           j3 = j;
/* 209 */                           i2 = -1;
                                }
/* 211 */                       long j4 = j3;
/* 215 */                       long j5 = jMo4838c - c1212b.f10127a;
/* 221 */                       if (j5 > 500) {
/* 229 */                           ArrayList arrayList = new ArrayList(linkedHashMap.size());
/* 244 */                           for (Map.Entry entry : linkedHashMap.entrySet()) {
/* 258 */                               int iIntValue = ((Number) entry.getKey()).intValue();
/* 266 */                               ArrayList<C1653h> arrayList2 = (ArrayList) entry.getValue();
/* 272 */                               if (!arrayList2.isEmpty()) {
/* 276 */                                   C1654i c1654i = new C1654i();
/* 279 */                                   c1654i.f11589b = jMo4838c;
/* 287 */                                   ArrayList arrayList3 = new ArrayList(C2122qw.m8020h(arrayList2, i));
/* 298 */                                   for (C1653h c1653h2 : arrayList2) {
/* 311 */                                       c1653h2.f11602d -= j5;
/* 313 */                                       arrayList3.add(c1653h2);
/* 316 */                                       c1654i = c1654i;
                                            }
/* 321 */                                   C1654i c1654i2 = c1654i;
/* 322 */                                   c1654i2.f11605e = arrayList3;
/* 324 */                                   c1654i2.f11604d = iIntValue;
/* 326 */                                   arrayList.add(c1654i2);
/* 333 */                                   Object obj2 = linkedHashMap.get(Integer.valueOf(iIntValue));
/* 337 */                                   obj2.getClass();
/* 342 */                                   ((ArrayList) obj2).clear();
/* 345 */                                   i = 10;
                                        }
                                    }
/* 350 */                           c1212b.f10127a = j4;
                                    list = arrayList;
                                } else {
/* 50 */                            list = null;
                                }
                            } else {
/* 50 */                        list = null;
                            }
                        } else if (actionMasked != 3) {
/* 45 */                    if (actionMasked == 5) {
/* 421 */                       pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 425 */                       iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
/* 430 */                       if (iFindPointerIndex != -1) {
/* 445 */                           linkedHashMap.put(Integer.valueOf(pointerId), new ArrayList(10));
/* 450 */                           C1652g c1652g3 = new C1652g();
/* 457 */                           c1652g3.f11589b = interfaceC1680f.mo4838c();
/* 464 */                           c1652g3.f11595f = motionEvent.getX(iFindPointerIndex) * f2;
/* 471 */                           c1652g3.f11596i = motionEvent.getY(iFindPointerIndex) * f;
/* 474 */                           c1652g3.f11594e = 0;
/* 476 */                           c1652g3.f11598w = pointerId;
/* 480 */                           c1652g3.f11593d = EnumC1651f.TouchStart;
/* 482 */                           listM6210b = C1839a.m6210b(c1652g3);
                                }
                            } else if (actionMasked == 6) {
/* 358 */                       pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
/* 362 */                       iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId2);
/* 367 */                       if (iFindPointerIndex2 != -1) {
/* 375 */                           linkedHashMap.remove(Integer.valueOf(pointerId2));
/* 380 */                           C1652g c1652g4 = new C1652g();
/* 387 */                           c1652g4.f11589b = interfaceC1680f.mo4838c();
/* 394 */                           c1652g4.f11595f = motionEvent.getX(iFindPointerIndex2) * f2;
/* 401 */                           c1652g4.f11596i = motionEvent.getY(iFindPointerIndex2) * f;
/* 404 */                           c1652g4.f11594e = 0;
/* 406 */                           c1652g4.f11598w = pointerId2;
/* 410 */                           c1652g4.f11593d = EnumC1651f.TouchEnd;
/* 412 */                           listM6210b2 = C1839a.m6210b(c1652g4);
                                }
                            }
/* 50 */                    list = null;
                        } else {
/* 53 */                    linkedHashMap.clear();
/* 58 */                    C1652g c1652g5 = new C1652g();
/* 65 */                    c1652g5.f11589b = interfaceC1680f.mo4838c();
/* 72 */                    c1652g5.f11595f = motionEvent.getX() * f2;
/* 79 */                    c1652g5.f11596i = motionEvent.getY() * f;
/* 81 */                    c1652g5.f11594e = 0;
/* 83 */                    c1652g5.f11598w = 0;
/* 87 */                    c1652g5.f11593d = EnumC1651f.TouchCancel;
/* 89 */                    listM6210b3 = C1839a.m6210b(c1652g5);
                        }
/* 486 */               if (list == null) {
                            list = listM6210b;
                            list = listM6210b2;
                            list = listM6210b3;
/* 493 */                   return;
                        } else {
                            list = listM6210b;
                            list = listM6210b2;
                            list = listM6210b3;
/* 490 */                   C2270uw.m9140k(this.f10473p, list);
                        }
                    }
                }

                /* JADX INFO: renamed from: j */
                public abstract void mo4993j();

                /* JADX INFO: renamed from: k */
                public final void m4994k(int i) {
/* 4 */             u21 u21Var = f10457s[4];
/* 6 */             Integer numValueOf = Integer.valueOf(i);
/* 10 */            C1300b c1300b = this.f10471n;
/* 12 */            c1300b.getClass();
/* 15 */            u21Var.getClass();
/* 20 */            Object andSet = c1300b.f10454b.getAndSet(numValueOf);
/* 28 */            if (Intrinsics.m6216a(andSet, numValueOf)) {
/* 87 */                return;
                    }
/* 35 */            t60 t60Var = new t60(andSet, numValueOf, c1300b.f10456d, 1);
/* 38 */            AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 40 */            C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 50 */            if (c1554m6.getThreadChecker().mo4842c()) {
/* 67 */                abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(t60Var, 2), "CaptureStrategy.runInBackground"));
/* 70 */                return;
                    }
                    try {
/* 71 */                t60Var.invoke();
                    } catch (Throwable th) {
/* 84 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m4995l(Date date) {
/* 4 */             u21 u21Var = f10457s[1];
/* 6 */             C1300b c1300b = this.f10467j;
/* 8 */             c1300b.getClass();
/* 11 */            u21Var.getClass();
/* 16 */            Object andSet = c1300b.f10454b.getAndSet(date);
/* 24 */            if (Intrinsics.m6216a(andSet, date)) {
/* 83 */                return;
                    }
/* 31 */            C1299a c1299a = new C1299a(andSet, date, c1300b.f10456d, 2);
/* 34 */            AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 36 */            C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 46 */            if (c1554m6.getThreadChecker().mo4842c()) {
/* 63 */                abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 5), "CaptureStrategy.runInBackground"));
/* 66 */                return;
                    }
                    try {
/* 67 */                c1299a.invoke();
                    } catch (Throwable th) {
/* 80 */                c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }

                /* JADX INFO: renamed from: m */
                public void mo4996m(int i, C1626w c1626w, EnumC1567n6 enumC1567n6) {
/* 1 */             c1626w.getClass();
/* 11 */            this.f10465h = new C1326k(this.f10458a, c1626w);
/* 13 */            u21[] u21VarArr = f10457s;
/* 15 */            int i2 = 3;
/* 16 */            u21 u21Var = u21VarArr[3];
/* 18 */            C1300b c1300b = this.f10470m;
/* 20 */            c1300b.getClass();
/* 23 */            u21Var.getClass();
/* 28 */            Object andSet = c1300b.f10454b.getAndSet(c1626w);
/* 40 */            if (!Intrinsics.m6216a(andSet, c1626w)) {
/* 47 */                C1299a c1299a = new C1299a(andSet, c1626w, c1300b.f10456d, 0);
/* 50 */                AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 52 */                C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 62 */                if (c1554m6.getThreadChecker().mo4842c()) {
/* 77 */                    abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 1), "CaptureStrategy.runInBackground"));
                        } else {
                            try {
/* 81 */                        c1299a.invoke();
                            } catch (Throwable th) {
/* 92 */                        c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                            }
                        }
                    }
/* 95 */            m4994k(i);
/* 98 */            if (enumC1567n6 == null) {
/* 107 */               enumC1567n6 = this instanceof C1312n ? EnumC1567n6.SESSION : EnumC1567n6.BUFFER;
                    }
/* 109 */           enumC1567n6.getClass();
/* 113 */           u21 u21Var2 = u21VarArr[5];
/* 115 */           C1300b c1300b2 = this.f10472o;
/* 117 */           c1300b2.getClass();
/* 120 */           u21Var2.getClass();
/* 125 */           Object andSet2 = c1300b2.f10454b.getAndSet(enumC1567n6);
/* 133 */           if (!Intrinsics.m6216a(andSet2, enumC1567n6)) {
/* 140 */               t60 t60Var = new t60(andSet2, enumC1567n6, c1300b2.f10456d, 2);
/* 143 */               AbstractC1301c abstractC1301c2 = c1300b2.f10455c;
/* 145 */               C1554m6 c1554m7 = abstractC1301c2.f10458a;
/* 155 */               if (c1554m7.getThreadChecker().mo4842c()) {
/* 169 */                   abstractC1301c2.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(t60Var, i2), "CaptureStrategy.runInBackground"));
                        } else {
                            try {
/* 173 */                       t60Var.invoke();
                            } catch (Throwable th2) {
/* 184 */                       c1554m7.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th2);
                            }
                        }
                    }
/* 192 */           m4995l(new Date());
/* 203 */           this.f10468k.set(this.f10460c.mo4838c());
                }

                /* JADX INFO: renamed from: n */
                public abstract void mo4997n();
            }
