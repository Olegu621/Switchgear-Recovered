            package io.sentry.android.replay.capture;

            import android.graphics.Bitmap;
            import android.graphics.BitmapFactory;
            import android.media.MediaCodec;
            import android.media.MediaCrypto;
            import android.media.MediaFormat;
            import android.view.Surface;
            import androidx.core.app.NotificationCompat;
            import io.sentry.C1443f;
            import io.sentry.C1554m6;
            import io.sentry.C1576o6;
            import io.sentry.C1637q6;
            import io.sentry.C1745x3;
            import io.sentry.EnumC1490i4;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1567n6;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.android.core.C1181d;
            import io.sentry.android.replay.C1313d;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1327l;
            import io.sentry.android.replay.C1328m;
            import io.sentry.android.replay.video.C1360a;
            import io.sentry.android.replay.video.C1361b;
            import io.sentry.protocol.C1624u;
            import io.sentry.protocol.C1626w;
            import io.sentry.rrweb.AbstractC1647b;
            import io.sentry.rrweb.C1646a;
            import io.sentry.rrweb.C1655j;
            import io.sentry.rrweb.C1656k;
            import io.sentry.rrweb.C1658m;
            import io.sentry.rrweb.EnumC1648c;
            import io.sentry.util.C1702a;
            import java.io.File;
            import java.util.ArrayList;
            import java.util.Date;
            import java.util.Deque;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.CopyOnWriteArraySet;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1996oc;
            import p000.gs2;
            import p000.h22;
            import p000.na1;
            import p000.nd0;
            import p000.oa1;
            import p000.p51;
            import p000.q02;
            import p000.r21;
            import p000.ra1;
            import p000.s21;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.capture.i */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1307i {
                /* JADX WARN: Code duplicated, block: B:101:0x0211  */
                /* JADX WARN: Code duplicated, block: B:104:0x021c A[LOOP:2: B:46:0x0149->B:104:0x021c, LOOP_END] */
                /* JADX WARN: Code duplicated, block: B:137:0x0298  */
                /* JADX WARN: Code duplicated, block: B:139:0x02a0  */
                /* JADX WARN: Code duplicated, block: B:141:0x02ab  */
                /* JADX WARN: Code duplicated, block: B:143:0x02b9  */
                /* JADX WARN: Code duplicated, block: B:147:0x0330  */
                /* JADX WARN: Code duplicated, block: B:163:0x0383  */
                /* JADX WARN: Code duplicated, block: B:173:0x03bb  */
                /* JADX WARN: Code duplicated, block: B:174:0x03bf  */
                /* JADX WARN: Code duplicated, block: B:176:0x03c2  */
                /* JADX WARN: Code duplicated, block: B:177:0x03c5  */
                /* JADX WARN: Code duplicated, block: B:180:0x03ce  */
                /* JADX WARN: Code duplicated, block: B:182:0x03d6  */
                /* JADX WARN: Code duplicated, block: B:184:0x03dc  */
                /* JADX WARN: Code duplicated, block: B:187:0x03e1  */
                /* JADX WARN: Code duplicated, block: B:196:0x041e  */
                /* JADX WARN: Code duplicated, block: B:200:0x0433  */
                /* JADX WARN: Code duplicated, block: B:202:0x044b  */
                /* JADX WARN: Code duplicated, block: B:205:0x04ac  */
                /* JADX WARN: Code duplicated, block: B:206:0x04af  */
                /* JADX WARN: Code duplicated, block: B:209:0x04cf  */
                /* JADX WARN: Code duplicated, block: B:211:0x04f7  */
                /* JADX WARN: Code duplicated, block: B:274:0x03f2 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:275:0x03f2 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:277:0x042a A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:279:0x0418 A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:283:0x022c A[SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:83:0x01d7  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public static AbstractC1310l m4999a(InterfaceC1389c1 interfaceC1389c1, C1554m6 c1554m6, long j, Date date, C1626w c1626w, int i, int i2, int i3, EnumC1567n6 enumC1567n6, C1326k c1326k, int i4, int i5, String str, List list, Deque deque, List list2) {
                    Throwable th;
                    ArrayList arrayList;
                    C1702a c1702a;
                    int i6;
                    ra1 ra1Var;
                    C1326k c1326k2;
                    int i7;
                    C1443f c1443f;
                    C1313d c1313d;
                    Object obj;
                    long j2;
                    Object obj2;
                    long j3;
                    C1702a c1702a2;
                    ArrayList arrayList2;
                    List list3;
                    List<C1443f> list4;
                    ArrayList arrayList3;
                    LinkedList linkedList;
                    C1443f c1443f2;
                    long time;
                    C1996oc c1996oc;
                    Iterator it;
                    HashMap map;
                    C1624u sdkVersion;
                    C1637q6 sessionReplay;
                    String str2;
                    AbstractC1647b abstractC1647b;
                    boolean z;
                    AbstractC1647b abstractC1647bMo4983a;
                    C1646a c1646a;
                    Object obj3;
                    C1646a c1646a2;
                    ConcurrentHashMap concurrentHashMap;
                    Object obj4;
                    C1646a c1646a3;
                    h22 h22Var;
                    c1554m6.getClass();
                    c1626w.getClass();
                    list2.getClass();
                    if (c1326k != null) {
/* 1 */                 C1554m6 c1554m7 = c1326k.f10552a;
/* 2 */                 long jMin = Math.min(j, 300000L);
/* 3 */                 long time2 = date.getTime();
/* 4 */                 File file = new File(c1326k.m5015g(), i + ".mp4");
/* 5 */                 C1702a c1702a3 = c1326k.f10557f;
/* 6 */                 ArrayList arrayList4 = c1326k.f10560w;
                        C1702a c1702a4 = c1326k.f10555d;
                        long j4 = 0;
/* 7 */                 if (file.exists() && file.length() > 0) {
/* 8 */                     file.delete();
                        }
/* 9 */                 c1702a3.m5443c();
                        try {
                            if (arrayList4.isEmpty()) {
                                try {
                                    arrayList = new ArrayList();
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
/* 218 */                               throw th;
                                    } catch (Throwable th3) {
                                        xe2.m9770h(c1702a3, th);
                                        throw th3;
                                    }
                                }
                            } else {
                                arrayList = CollectionsKt.m6194M(arrayList4);
                            }
                            List list5 = arrayList;
                            xe2.m9770h(c1702a3, null);
/* 10 */                    if (list5.isEmpty()) {
/* 11 */                        c1554m7.getLogger().mo4672k(EnumC1553m5.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                                i6 = i4;
                            } else {
/* 12 */                        c1702a4.m5443c();
                                try {
                                    C1702a c1702a5 = c1702a3;
                                    ArrayList arrayList5 = arrayList4;
                                    i6 = i4;
                                    try {
/* 15 */                                C1181d c1181d = new C1181d(c1554m7, new C1360a(file, i3, i2, i6, i5));
/* 16 */                                MediaCodec mediaCodec = (MediaCodec) c1181d.f9986c;
/* 19 */                                mediaCodec.configure((MediaFormat) ((p51) c1181d.f9987d).getValue(), (Surface) null, (MediaCrypto) null, 1);
/* 20 */                                c1181d.f9990g = mediaCodec.createInputSurface();
/* 21 */                                mediaCodec.start();
/* 22 */                                c1181d.m4778c(false);
/* 23 */                                xe2.m9770h(c1702a4, null);
/* 24 */                                c1326k.f10558i = c1181d;
/* 25 */                                long j5 = 1000 / ((long) i6);
/* 26 */                                Object objFirstOrNull = CollectionsKt.firstOrNull(list5);
                                        long j6 = time2 + jMin;
                                        if (j6 <= Long.MIN_VALUE) {
/* 27 */                                    ra1.f15951e.getClass();
/* 28 */                                    ra1Var = ra1.f15952f;
                                        } else {
/* 29 */                                    ra1Var = new ra1(time2, j6 - 1);
                                        }
/* 30 */                                ra1Var.getClass();
/* 31 */                                q02.m7675a(j5 > 0, Long.valueOf(j5));
/* 32 */                                na1 na1Var = oa1.f14690d;
/* 33 */                                long j7 = ra1Var.f14691a;
/* 34 */                                long j8 = ra1Var.f14692b;
                                        long j9 = ra1Var.f14693c > 0 ? j5 : -j5;
/* 36 */                                na1Var.getClass();
/* 38 */                                long j10 = new oa1(j7, j8, j9).f14692b;
                                        if ((j9 > 0 && j7 <= j10) || (j9 < 0 && j10 <= j7)) {
                                            Object obj5 = objFirstOrNull;
                                            long j11 = j7;
                                            int i8 = 0;
                                            while (true) {
/* 39 */                                        Iterator it2 = list5.iterator();
                                                while (true) {
/* 40 */                                            if (it2.hasNext()) {
                                                        obj = obj5;
/* 41 */                                                C1327l c1327l = (C1327l) it2.next();
                                                        long j12 = j11 + j5;
                                                        j2 = j11;
/* 42 */                                                long j13 = c1327l.f10562b;
                                                        if (j2 <= j13 && j13 <= j12) {
                                                            obj2 = c1327l;
                                                            break;
                                                        }
                                                        if (j13 <= j12) {
                                                            obj5 = obj;
                                                            j11 = j2;
                                                        }
                                                    } else {
                                                        obj = obj5;
                                                        j2 = j11;
                                                    }
                                                    obj2 = obj;
                                                    break;
                                                }
/* 43 */                                        C1327l c1327l2 = (C1327l) obj2;
                                                if (c1327l2 == null) {
                                                    c1326k2 = c1326k;
                                                    j3 = j10;
                                                } else {
                                                    try {
/* 45 */                                                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(c1327l2.f10561a.getAbsolutePath());
/* 46 */                                                c1702a4.m5443c();
                                                        c1326k2 = c1326k;
                                                        j3 = j10;
                                                        try {
                                                            C1181d c1181d2 = c1326k2.f10558i;
                                                            if (c1181d2 != null) {
                                                                bitmapDecodeFile.getClass();
                                                                c1181d2.m4779d(bitmapDecodeFile);
                                                            }
                                                            try {
                                                                xe2.m9770h(c1702a4, null);
/* 47 */                                                        bitmapDecodeFile.recycle();
                                                                i8++;
                                                                obj5 = obj2;
                                                                j5 = j5;
                                                                c1702a2 = c1702a5;
                                                                arrayList2 = arrayList5;
                                                                list3 = list5;
                                                            } catch (Throwable th4) {
                                                                th = th4;
/* 52 */                                                        c1554m7.getLogger().mo4671d(EnumC1553m5.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
                                                                if (obj2 != null) {
/* 55 */                                                            c1326k2.m5014f(((C1327l) obj2).f10561a);
/* 56 */                                                            c1702a5.m5443c();
                                                                    arrayList2 = arrayList5;
                                                                    try {
/* 57 */                                                                if (arrayList2 instanceof r21) {
/* 58 */                                                                    gs2.m4013d(arrayList2, "kotlin.collections.MutableCollection");
                                                                            throw null;
                                                                        }
                                                                        try {
/* 59 */                                                                    arrayList2.remove(obj2);
                                                                            c1702a2 = c1702a5;
                                                                            xe2.m9770h(c1702a2, null);
                                                                            list3 = list5;
/* 60 */                                                                    list3.remove(obj2);
                                                                            obj5 = null;
                                                                        } catch (Throwable th5) {
                                                                            th = th5;
                                                                            C1702a c1702a6 = c1702a5;
                                                                            Throwable th6 = th;
                                                                            try {
/* 61 */                                                                        throw th6;
                                                                            } catch (Throwable th7) {
                                                                                xe2.m9770h(c1702a6, th6);
                                                                                throw th7;
                                                                            }
                                                                        }
                                                                    } catch (Throwable th8) {
                                                                        th = th8;
                                                                    }
                                                                } else {
                                                                    list3 = list5;
                                                                    c1702a2 = c1702a5;
                                                                    arrayList2 = arrayList5;
                                                                    obj5 = obj2;
                                                                }
                                                            }
                                                            if (j2 != j3) {
                                                                i7 = i8;
                                                                break;
                                                            }
                                                            arrayList5 = arrayList2;
                                                            list5 = list3;
                                                            j11 = j2 + j9;
                                                            j5 = j5;
                                                            c1702a5 = c1702a2;
                                                            j10 = j3;
                                                        } catch (Throwable th9) {
                                                            try {
/* 48 */                                                        throw th9;
                                                            } catch (Throwable th10) {
                                                                xe2.m9770h(c1702a4, th9);
                                                                throw th10;
                                                            }
                                                        }
                                                    } catch (Throwable th11) {
                                                        th = th11;
                                                        c1326k2 = c1326k;
                                                        j3 = j10;
                                                    }
                                                }
                                                if (obj2 != null) {
/* 55 */                                            c1326k2.m5014f(((C1327l) obj2).f10561a);
/* 56 */                                            c1702a5.m5443c();
                                                    arrayList2 = arrayList5;
/* 57 */                                            if ((arrayList2 instanceof r21) && !(arrayList2 instanceof s21)) {
/* 58 */                                                gs2.m4013d(arrayList2, "kotlin.collections.MutableCollection");
                                                        throw null;
                                                    }
/* 59 */                                            arrayList2.remove(obj2);
                                                    c1702a2 = c1702a5;
                                                    xe2.m9770h(c1702a2, null);
                                                    list3 = list5;
/* 60 */                                            list3.remove(obj2);
                                                    obj5 = null;
                                                } else {
                                                    list3 = list5;
                                                    c1702a2 = c1702a5;
                                                    arrayList2 = arrayList5;
                                                    obj5 = obj2;
                                                }
                                                if (j2 != j3) {
                                                    i7 = i8;
                                                    break;
                                                }
                                                arrayList5 = arrayList2;
                                                list5 = list3;
                                                j11 = j2 + j9;
                                                j5 = j5;
                                                c1702a5 = c1702a2;
                                                j10 = j3;
                                            }
                                        } else {
                                            c1326k2 = c1326k;
                                            i7 = 0;
                                        }
                                        if (i7 == 0) {
/* 62 */                                    c1554m7.getLogger().mo4672k(EnumC1553m5.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
/* 63 */                                    c1702a4.m5443c();
                                            try {
/* 64 */                                        C1181d c1181d3 = c1326k2.f10558i;
                                                if (c1181d3 != null) {
                                                    c1181d3.m4781f();
                                                }
/* 65 */                                        c1326k2.f10558i = null;
/* 66 */                                        xe2.m9770h(c1702a4, null);
/* 67 */                                        c1326k2.m5014f(file);
                                            } catch (Throwable th12) {
                                                try {
/* 68 */                                            throw th12;
                                                } catch (Throwable th13) {
                                                    xe2.m9770h(c1702a4, th12);
                                                    throw th13;
                                                }
                                            }
                                        } else {
/* 69 */                                    c1702a4.m5443c();
                                            try {
/* 70 */                                        C1181d c1181d4 = c1326k2.f10558i;
                                                if (c1181d4 != null) {
                                                    c1181d4.m4781f();
                                                }
/* 71 */                                        C1181d c1181d5 = c1326k2.f10558i;
                                                if (c1181d5 != null) {
/* 72 */                                            C1361b c1361b = (C1361b) c1181d5.f9989f;
/* 73 */                                            if (c1361b.f10677e != 0) {
/* 74 */                                                j4 = (c1361b.f10678f + c1361b.f10673a) / 1000;
                                                    }
                                                }
                                                long j14 = j4;
                                                c1443f = null;
/* 75 */                                        c1326k2.f10558i = null;
/* 76 */                                        xe2.m9770h(c1702a4, null);
/* 77 */                                        c1326k2.m5017i(j6);
/* 78 */                                        c1313d = new C1313d(file, i7, j14);
                                            } catch (Throwable th14) {
                                                try {
/* 216 */                                           throw th14;
                                                } catch (Throwable th15) {
                                                    xe2.m9770h(c1702a4, th14);
                                                    throw th15;
                                                }
                                            }
                                        }
                                        if (c1313d != null) {
/* 79 */                                    File file2 = c1313d.f10501a;
/* 80 */                                    int i9 = c1313d.f10502b;
/* 81 */                                    long j15 = c1313d.f10503c;
                                            if (list == null) {
/* 83 */                                        h22Var = new h22();
/* 85 */                                        h22Var.f8873a = nd0.f14189a;
                                                if (interfaceC1389c1 != null) {
/* 87 */                                            interfaceC1389c1.mo5098r(new C1328m(1, h22Var));
                                                }
/* 88 */                                        list4 = (List) h22Var.f8873a;
                                            } else {
                                                list4 = list;
                                            }
/* 90 */                                    Date date2 = new Date(date.getTime() + j15);
/* 91 */                                    C1576o6 c1576o6 = new C1576o6();
/* 92 */                                    c1576o6.f11516a = c1626w;
/* 93 */                                    c1576o6.f11212d0 = c1626w;
/* 94 */                                    c1576o6.f11213e0 = i;
/* 95 */                                    c1576o6.f11214f0 = date2;
/* 96 */                                    c1576o6.f11215g0 = date;
/* 97 */                                    c1576o6.f11211c0 = enumC1567n6;
/* 98 */                                    c1576o6.f11209a0 = file2;
/* 99 */                                    c1576o6.f11218j0 = list2;
/* 100 */                                   arrayList3 = new ArrayList();
/* 101 */                                   C1655j c1655j = new C1655j();
/* 103 */                                   c1655j.f11589b = date.getTime();
/* 104 */                                   c1655j.f11609d = i2;
/* 105 */                                   c1655j.f11610e = i3;
/* 106 */                                   arrayList3.add(c1655j);
/* 107 */                                   C1658m c1658m = new C1658m();
/* 109 */                                   c1658m.f11589b = date.getTime();
/* 110 */                                   c1658m.f11633d = i;
/* 111 */                                   c1658m.f11635f = j15;
/* 112 */                                   c1658m.f11624V = i9;
/* 114 */                                   c1658m.f11634e = file2.length();
/* 115 */                                   c1658m.f11626X = i6;
/* 116 */                                   c1658m.f11638w = i2;
/* 117 */                                   c1658m.f11623U = i3;
/* 118 */                                   c1658m.f11627Y = 0;
/* 119 */                                   c1658m.f11628Z = 0;
/* 120 */                                   arrayList3.add(c1658m);
/* 121 */                                   linkedList = new LinkedList();
                                            c1443f2 = c1443f;
                                            for (C1443f c1443f3 : list4) {
/* 124 */                                       if (c1443f2 == null && Intrinsics.m6216a(c1443f2.f10932i, "network.event")) {
/* 125 */                                           Map mapM5207b = c1443f2.m5207b();
/* 126 */                                           mapM5207b.getClass();
                                                    Object obj6 = mapM5207b.get("action");
                                                    if (obj6 == null) {
                                                        obj6 = c1443f;
                                                    }
/* 128 */                                           if (Intrinsics.m6216a(obj6, "NETWORK_AVAILABLE") && Intrinsics.m6216a(c1443f3.f10932i, "network.event") && c1443f3.m5207b().containsKey("network_type") && c1443f3.m5208c().getTime() + 5000 >= date.getTime()) {
                                                        z = true;
                                                    } else {
                                                        z = false;
                                                    }
                                                } else {
                                                    z = false;
                                                }
                                                if ((c1443f3.m5208c().getTime() < date.getTime() || z) && c1443f3.m5208c().getTime() < date2.getTime() && (abstractC1647bMo4983a = c1554m6.getReplayController().getF10414Z().mo4983a(c1443f3)) != null) {
/* 135 */                                           arrayList3.add(abstractC1647bMo4983a);
/* 136 */                                           if (abstractC1647bMo4983a instanceof C1646a) {
                                                        c1646a3 = (C1646a) abstractC1647bMo4983a;
                                                    } else {
                                                        c1646a = c1443f;
                                                    }
                                                    if (c1646a != 0) {
                                                        c1646a = c1646a3;
/* 137 */                                               obj3 = c1646a.f11584f;
                                                    } else {
                                                        c1646a = c1646a3;
                                                        obj3 = c1443f;
                                                    }
/* 138 */                                           if (Intrinsics.m6216a(obj3, NotificationCompat.CATEGORY_NAVIGATION)) {
/* 139 */                                               c1646a2 = (C1646a) abstractC1647bMo4983a;
/* 140 */                                               concurrentHashMap = c1646a2.f11587w;
                                                        if (concurrentHashMap != null || (obj4 = concurrentHashMap.get("to")) == null) {
                                                            obj4 = c1443f;
                                                        }
                                                        if (obj4 instanceof String) {
/* 142 */                                                   ConcurrentHashMap concurrentHashMap2 = c1646a2.f11587w;
/* 143 */                                                   concurrentHashMap2.getClass();
/* 141 */                                                   Object obj7 = concurrentHashMap2.get("to");
                                                            obj7.getClass();
                                                            linkedList.add((String) obj7);
                                                        }
                                                    }
                                                }
                                                c1443f2 = c1443f3;
                                            }
/* 144 */                                   if (str != null && !Intrinsics.m6216a(CollectionsKt.firstOrNull(linkedList), str)) {
/* 145 */                                       linkedList.addFirst(str);
                                            }
/* 146 */                                   time = date2.getTime();
                                            c1996oc = new C1996oc(19, date, arrayList3);
/* 147 */                                   it = deque.iterator();
                                            it.getClass();
/* 148 */                                   while (it.hasNext()) {
/* 149 */                                       abstractC1647b = (AbstractC1647b) it.next();
                                                if (abstractC1647b.f11589b < time) {
/* 151 */                                           c1996oc.invoke(abstractC1647b);
/* 152 */                                           it.remove();
                                                }
                                            }
                                            if (i == 0) {
/* 153 */                                       C1656k c1656k = new C1656k(EnumC1648c.Custom);
/* 155 */                                       map = new HashMap();
                                                c1656k.f11613d = map;
/* 156 */                                       c1656k.f11612c = "options";
/* 157 */                                       sdkVersion = c1554m6.getSdkVersion();
                                                if (sdkVersion != null) {
/* 160 */                                           map.put("nativeSdkName", sdkVersion.f11466a);
/* 163 */                                           map.put("nativeSdkVersion", sdkVersion.f11467b);
                                                }
/* 164 */                                       sessionReplay = c1554m6.getSessionReplay();
/* 165 */                                       Double d = sessionReplay.f11528e;
                                                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) sessionReplay.f17000a;
/* 166 */                                       map.put("errorSampleRate", d);
/* 169 */                                       map.put("sessionSampleRate", sessionReplay.f11527d);
/* 171 */                                       map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.ImageView")));
/* 173 */                                       map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet.contains("android.widget.TextView")));
/* 175 */                                       map.put("quality", sessionReplay.f11529f.serializedName());
/* 176 */                                       map.put("maskedViewClasses", copyOnWriteArraySet);
/* 178 */                                       map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.f17001b);
/* 180 */                                       if (sessionReplay.f11537n == EnumC1490i4.PIXEL_COPY) {
/* 181 */                                           str2 = "pixelCopy";
                                                } else {
/* 182 */                                           str2 = "canvas";
                                                }
/* 183 */                                       map.put("screenshotStrategy", str2);
/* 186 */                                       map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f11539p.isEmpty()));
/* 188 */                                       if (!sessionReplay.f11539p.isEmpty()) {
/* 191 */                                           map.put("networkDetailAllowUrls", sessionReplay.f11539p);
/* 194 */                                           map.put("networkRequestHeaders", sessionReplay.f11542s);
/* 197 */                                           map.put("networkResponseHeaders", sessionReplay.f11543t);
/* 199 */                                           map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f11541r));
/* 201 */                                           if (!sessionReplay.f11540q.isEmpty()) {
/* 204 */                                               map.put("networkDetailDenyUrls", sessionReplay.f11540q);
                                                    }
                                                }
/* 205 */                                       arrayList3.add(c1656k);
                                            }
/* 207 */                                   C1745x3 c1745x3 = new C1745x3();
/* 209 */                                   c1745x3.f11809a = Integer.valueOf(i);
/* 213 */                                   c1745x3.f11810b = CollectionsKt.m6186E(new C1306h(), arrayList3);
/* 214 */                                   c1576o6.f11216h0 = linkedList;
/* 215 */                                   return new C1308j(c1576o6, c1745x3);
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        c1702a = c1702a4;
                                        Throwable th17 = th;
                                        try {
/* 217 */                                   throw th17;
                                        } catch (Throwable th18) {
                                            xe2.m9770h(c1702a, th17);
                                            throw th18;
                                        }
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    c1702a = c1702a4;
                                }
                            }
                            c1313d = null;
                            c1443f = null;
                            if (c1313d != null) {
/* 79 */                        File file3 = c1313d.f10501a;
/* 80 */                        int i10 = c1313d.f10502b;
/* 81 */                        long j16 = c1313d.f10503c;
                                if (list == null) {
/* 83 */                            h22Var = new h22();
/* 85 */                            h22Var.f8873a = nd0.f14189a;
                                    if (interfaceC1389c1 != null) {
/* 87 */                                interfaceC1389c1.mo5098r(new C1328m(1, h22Var));
                                    }
/* 88 */                            list4 = (List) h22Var.f8873a;
                                } else {
                                    list4 = list;
                                }
/* 90 */                        Date date3 = new Date(date.getTime() + j16);
/* 91 */                        C1576o6 c1576o7 = new C1576o6();
/* 92 */                        c1576o7.f11516a = c1626w;
/* 93 */                        c1576o7.f11212d0 = c1626w;
/* 94 */                        c1576o7.f11213e0 = i;
/* 95 */                        c1576o7.f11214f0 = date3;
/* 96 */                        c1576o7.f11215g0 = date;
/* 97 */                        c1576o7.f11211c0 = enumC1567n6;
/* 98 */                        c1576o7.f11209a0 = file3;
/* 99 */                        c1576o7.f11218j0 = list2;
/* 100 */                       arrayList3 = new ArrayList();
/* 101 */                       C1655j c1655j2 = new C1655j();
/* 103 */                       c1655j2.f11589b = date.getTime();
/* 104 */                       c1655j2.f11609d = i2;
/* 105 */                       c1655j2.f11610e = i3;
/* 106 */                       arrayList3.add(c1655j2);
/* 107 */                       C1658m c1658m2 = new C1658m();
/* 109 */                       c1658m2.f11589b = date.getTime();
/* 110 */                       c1658m2.f11633d = i;
/* 111 */                       c1658m2.f11635f = j16;
/* 112 */                       c1658m2.f11624V = i10;
/* 114 */                       c1658m2.f11634e = file3.length();
/* 115 */                       c1658m2.f11626X = i6;
/* 116 */                       c1658m2.f11638w = i2;
/* 117 */                       c1658m2.f11623U = i3;
/* 118 */                       c1658m2.f11627Y = 0;
/* 119 */                       c1658m2.f11628Z = 0;
/* 120 */                       arrayList3.add(c1658m2);
/* 121 */                       linkedList = new LinkedList();
                                c1443f2 = c1443f;
                                while (r1.hasNext()) {
                                    if (c1443f2 == null) {
                                        z = false;
                                    } else {
                                        z = false;
                                    }
                                    if (c1443f3.m5208c().getTime() < date.getTime()) {
/* 135 */                               arrayList3.add(abstractC1647bMo4983a);
/* 136 */                               if (abstractC1647bMo4983a instanceof C1646a) {
                                            c1646a3 = (C1646a) abstractC1647bMo4983a;
                                        } else {
                                            c1646a = c1443f;
                                        }
                                        if (c1646a != 0) {
                                            c1646a = c1646a3;
/* 137 */                                   obj3 = c1646a.f11584f;
                                        } else {
                                            c1646a = c1646a3;
                                            obj3 = c1443f;
                                        }
/* 138 */                               if (Intrinsics.m6216a(obj3, NotificationCompat.CATEGORY_NAVIGATION)) {
/* 139 */                                   c1646a2 = (C1646a) abstractC1647bMo4983a;
/* 140 */                                   concurrentHashMap = c1646a2.f11587w;
                                            if (concurrentHashMap != null) {
                                                obj4 = c1443f;
                                            } else {
                                                obj4 = c1443f;
                                            }
                                            if (obj4 instanceof String) {
/* 142 */                                       ConcurrentHashMap concurrentHashMap3 = c1646a2.f11587w;
/* 143 */                                       concurrentHashMap3.getClass();
/* 141 */                                       Object obj8 = concurrentHashMap3.get("to");
                                                obj8.getClass();
                                                linkedList.add((String) obj8);
                                            }
                                        }
                                    } else {
/* 135 */                               arrayList3.add(abstractC1647bMo4983a);
/* 136 */                               if (abstractC1647bMo4983a instanceof C1646a) {
                                            c1646a3 = (C1646a) abstractC1647bMo4983a;
                                        } else {
                                            c1646a = c1443f;
                                        }
                                        if (c1646a != 0) {
                                            c1646a = c1646a3;
/* 137 */                                   obj3 = c1646a.f11584f;
                                        } else {
                                            c1646a = c1646a3;
                                            obj3 = c1443f;
                                        }
/* 138 */                               if (Intrinsics.m6216a(obj3, NotificationCompat.CATEGORY_NAVIGATION)) {
/* 139 */                                   c1646a2 = (C1646a) abstractC1647bMo4983a;
/* 140 */                                   concurrentHashMap = c1646a2.f11587w;
                                            if (concurrentHashMap != null) {
                                                obj4 = c1443f;
                                            } else {
                                                obj4 = c1443f;
                                            }
                                            if (obj4 instanceof String) {
/* 142 */                                       ConcurrentHashMap concurrentHashMap4 = c1646a2.f11587w;
/* 143 */                                       concurrentHashMap4.getClass();
/* 141 */                                       Object obj9 = concurrentHashMap4.get("to");
                                                obj9.getClass();
                                                linkedList.add((String) obj9);
                                            }
                                        }
                                    }
                                    c1443f2 = c1443f3;
                                }
                                if (str != null) {
/* 145 */                           linkedList.addFirst(str);
                                }
/* 146 */                       time = date3.getTime();
                                c1996oc = new C1996oc(19, date, arrayList3);
/* 147 */                       it = deque.iterator();
                                it.getClass();
/* 148 */                       while (it.hasNext()) {
/* 149 */                           abstractC1647b = (AbstractC1647b) it.next();
                                    if (abstractC1647b.f11589b < time) {
/* 151 */                               c1996oc.invoke(abstractC1647b);
/* 152 */                               it.remove();
                                    }
                                }
                                if (i == 0) {
/* 153 */                           C1656k c1656k2 = new C1656k(EnumC1648c.Custom);
/* 155 */                           map = new HashMap();
                                    c1656k2.f11613d = map;
/* 156 */                           c1656k2.f11612c = "options";
/* 157 */                           sdkVersion = c1554m6.getSdkVersion();
                                    if (sdkVersion != null) {
/* 160 */                               map.put("nativeSdkName", sdkVersion.f11466a);
/* 163 */                               map.put("nativeSdkVersion", sdkVersion.f11467b);
                                    }
/* 164 */                           sessionReplay = c1554m6.getSessionReplay();
/* 165 */                           Double d2 = sessionReplay.f11528e;
                                    CopyOnWriteArraySet copyOnWriteArraySet2 = (CopyOnWriteArraySet) sessionReplay.f17000a;
/* 166 */                           map.put("errorSampleRate", d2);
/* 169 */                           map.put("sessionSampleRate", sessionReplay.f11527d);
/* 171 */                           map.put("maskAllImages", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.ImageView")));
/* 173 */                           map.put("maskAllText", Boolean.valueOf(copyOnWriteArraySet2.contains("android.widget.TextView")));
/* 175 */                           map.put("quality", sessionReplay.f11529f.serializedName());
/* 176 */                           map.put("maskedViewClasses", copyOnWriteArraySet2);
/* 178 */                           map.put("unmaskedViewClasses", (CopyOnWriteArraySet) sessionReplay.f17001b);
/* 180 */                           if (sessionReplay.f11537n == EnumC1490i4.PIXEL_COPY) {
/* 181 */                               str2 = "pixelCopy";
                                    } else {
/* 182 */                               str2 = "canvas";
                                    }
/* 183 */                           map.put("screenshotStrategy", str2);
/* 186 */                           map.put("networkDetailHasUrls", Boolean.valueOf(!sessionReplay.f11539p.isEmpty()));
/* 188 */                           if (!sessionReplay.f11539p.isEmpty()) {
/* 191 */                               map.put("networkDetailAllowUrls", sessionReplay.f11539p);
/* 194 */                               map.put("networkRequestHeaders", sessionReplay.f11542s);
/* 197 */                               map.put("networkResponseHeaders", sessionReplay.f11543t);
/* 199 */                               map.put("networkCaptureBodies", Boolean.valueOf(sessionReplay.f11541r));
/* 201 */                               if (!sessionReplay.f11540q.isEmpty()) {
/* 204 */                                   map.put("networkDetailDenyUrls", sessionReplay.f11540q);
                                        }
                                    }
/* 205 */                           arrayList3.add(c1656k2);
                                }
/* 207 */                       C1745x3 c1745x4 = new C1745x3();
/* 209 */                       c1745x4.f11809a = Integer.valueOf(i);
/* 213 */                       c1745x4.f11810b = CollectionsKt.m6186E(new C1306h(), arrayList3);
/* 214 */                       c1576o7.f11216h0 = linkedList;
/* 215 */                       return new C1308j(c1576o7, c1745x4);
                            }
                        } catch (Throwable th20) {
                            th = th20;
                        }
                    }
/* 219 */           return C1309k.f10495a;
                }
            }
