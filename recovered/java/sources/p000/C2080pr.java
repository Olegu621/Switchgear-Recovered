            package p000;

            import android.app.Activity;
            import android.content.ContentValues;
            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.database.Cursor;
            import android.database.sqlite.SQLiteDatabase;
            import android.hardware.camera2.CameraAccessException;
            import android.hardware.camera2.CameraDevice;
            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.params.InputConfiguration;
            import android.hardware.camera2.params.OutputConfiguration;
            import android.util.ArrayMap;
            import android.util.Base64;
            import android.util.Log;
            import android.view.Surface;
            import com.google.android.gms.tasks.SuccessContinuation;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.Tasks;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import com.google.firebase.messaging.FirebaseMessaging;
            import io.sentry.C1162a7;
            import io.sentry.C1393c5;
            import io.sentry.C1486i0;
            import io.sentry.C1748x6;
            import io.sentry.C1764z6;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1756y6;
            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1159a4;
            import io.sentry.InterfaceC1395c7;
            import io.sentry.InterfaceC1547m;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1761z3;
            import io.sentry.android.core.ActivityLifecycleIntegration;
            import io.sentry.android.core.C1176c;
            import io.sentry.android.core.C1181d;
            import io.sentry.android.core.C1184e;
            import io.sentry.android.core.RunnableC1173b;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1205g;
            import io.sentry.hints.InterfaceC1473a;
            import io.sentry.protocol.C1614n;
            import io.sentry.protocol.C1621r;
            import io.sentry.protocol.C1626w;
            import io.sentry.util.C1702a;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.Date;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.List;
            import java.util.Map;
            import java.util.WeakHashMap;
            import java.util.concurrent.CancellationException;
            import java.util.concurrent.ConcurrentHashMap;
            import java.util.concurrent.atomic.AtomicReference;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: renamed from: pr */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 981 */   public final /* synthetic */ class C2080pr implements InterfaceC2251ud, bk2, InterfaceC2299vm, SuccessContinuation, q52, InterfaceC1761z3, InterfaceC1395c7, InterfaceC1159a4 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15254a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f15255b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15256c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f15257d;

                public /* synthetic */ C2080pr(int i, Object obj, Object obj2, Object obj3) {
/* 1 */             this.f15254a = i;
/* 3 */             this.f15255b = obj;
/* 5 */             this.f15256c = obj2;
/* 7 */             this.f15257d = obj3;
                }

                @Override // io.sentry.InterfaceC1761z3
                /* JADX INFO: renamed from: a */
                public void mo5441a(C1764z6 c1764z6) {
                    ConcurrentHashMap concurrentHashMap;
/* 3 */             u93 u93Var = (u93) this.f15255b;
/* 7 */             C1393c5 c1393c5 = (C1393c5) this.f15256c;
/* 11 */            C1486i0 c1486i0 = (C1486i0) this.f15257d;
/* 14 */            if (c1764z6 == null) {
/* 119 */               ((SentryAndroidOptions) u93Var.f17429b).getLogger().mo4672k(EnumC1553m5.INFO, "Session is null on scope.withSession", new Object[0]);
/* 122 */               return;
                    }
/* 20 */            String strMo4962e = null;
/* 26 */            EnumC1756y6 enumC1756y6 = c1393c5.m5109f() != null ? EnumC1756y6.Crashed : null;
/* 29 */            boolean z = EnumC1756y6.Crashed == enumC1756y6 || c1393c5.m5110g();
/* 38 */            C1621r c1621r = c1393c5.f11519d;
/* 65 */            String str = (c1621r == null || (concurrentHashMap = c1621r.f11451f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) c1393c5.f11519d.f11451f.get("user-agent");
/* 68 */            Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 74 */            if (objM5273b instanceof InterfaceC1473a) {
/* 78 */                strMo4962e = ((InterfaceC1473a) objM5273b).mo4962e();
/* 82 */                enumC1756y6 = EnumC1756y6.Abnormal;
                    }
/* 88 */            if (!c1764z6.m5528c(enumC1756y6, str, z, strMo4962e) || c1764z6.f11867i == EnumC1756y6.Ok) {
/* 104 */               return;
                    }
/* 101 */           c1764z6.m5527b(new Date());
                }

                @Override // p000.q52
                public Object apply(Object obj) throws Throwable {
                    long jInsert;
                    Cursor cursor;
                    s52 s52Var;
                    ca1 ca1Var;
/* 3 */             int i = this.f15254a;
/* 11 */            int i2 = 6;
/* 12 */            int i3 = 5;
/* 13 */            int i4 = 4;
/* 14 */            int i5 = 3;
/* 15 */            ca1 ca1Var2 = ca1.CACHE_FULL;
/* 17 */            int i6 = 2;
/* 18 */            int i7 = 1;
/* 19 */            Object obj2 = this.f15257d;
/* 21 */            Object obj3 = this.f15256c;
/* 23 */            Object obj4 = this.f15255b;
/* 25 */            int i8 = 0;
                    switch (i) {
                        case 4:
/* 616 */                   s52 s52Var2 = (s52) obj4;
/* 618 */                   C2142rf c2142rf = (C2142rf) obj3;
/* 620 */                   sd0 sd0Var = c2142rf.f16032c;
/* 622 */                   String str = c2142rf.f16030a;
/* 624 */                   C2497yg c2497yg = (C2497yg) obj2;
/* 628 */                   SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
/* 659 */                   long jSimpleQueryForLong = s52Var2.m8404c().compileStatement("PRAGMA page_size").simpleQueryForLong() * s52Var2.m8404c().compileStatement("PRAGMA page_count").simpleQueryForLong();
/* 660 */                   C2179sf c2179sf = s52Var2.f16434d;
/* 666 */                   if (jSimpleQueryForLong >= c2179sf.f16554a) {
/* 670 */                       s52Var2.m8407i(1L, ca1Var2, str);
/* 675 */                       return -1L;
                            }
/* 681 */                   Long lM8401f = s52.m8401f(sQLiteDatabase, c2497yg);
/* 685 */                   if (lM8401f != null) {
/* 687 */                       jInsert = lM8401f.longValue();
                            } else {
/* 694 */                       ContentValues contentValues = new ContentValues();
/* 701 */                       contentValues.put("backend_name", c2497yg.f19600a);
/* 716 */                       contentValues.put("priority", Integer.valueOf(rx1.m8316a(c2497yg.f19602c)));
/* 721 */                       contentValues.put("next_request_ms", (Integer) 0);
/* 724 */                       byte[] bArr = c2497yg.f19601b;
/* 726 */                       if (bArr != null) {
/* 735 */                           contentValues.put("extras", Base64.encodeToString(bArr, 0));
                                }
/* 742 */                       jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
                            }
/* 747 */                   int i9 = c2179sf.f16558e;
/* 749 */                   byte[] bArr2 = sd0Var.f16540b;
/* 756 */                   boolean z = bArr2.length <= i9;
/* 759 */                   ContentValues contentValues2 = new ContentValues();
/* 768 */                   contentValues2.put("context_id", Long.valueOf(jInsert));
/* 773 */                   contentValues2.put("transport_name", str);
/* 784 */                   contentValues2.put("timestamp_ms", Long.valueOf(c2142rf.f16033d));
/* 795 */                   contentValues2.put("uptime_ms", Long.valueOf(c2142rf.f16034e));
/* 804 */                   contentValues2.put("payload_encoding", sd0Var.f16539a.f18011a);
/* 811 */                   contentValues2.put("code", c2142rf.f16031b);
/* 816 */                   contentValues2.put("num_attempts", (Integer) 0);
/* 825 */                   contentValues2.put("inline", Boolean.valueOf(z));
/* 837 */                   contentValues2.put("payload", z ? bArr2 : new byte[0]);
/* 843 */                   long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
/* 849 */                   if (!z) {
/* 859 */                       int iCeil = (int) Math.ceil(((double) bArr2.length) / ((double) i9));
/* 861 */                       for (int i10 = 1; i10 <= iCeil; i10++) {
/* 873 */                           byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, (i10 - 1) * i9, Math.min(i10 * i9, bArr2.length));
/* 879 */                           ContentValues contentValues3 = new ContentValues();
/* 886 */                           contentValues3.put("event_id", Long.valueOf(jInsert2));
/* 895 */                           contentValues3.put("sequence_num", Integer.valueOf(i10));
/* 898 */                           contentValues3.put("bytes", bArrCopyOfRange);
/* 904 */                           sQLiteDatabase.insert("event_payloads", null, contentValues3);
                                }
                            }
/* 928 */                   for (Map.Entry entry : Collections.unmodifiableMap(c2142rf.f16035f).entrySet()) {
/* 938 */                       ContentValues contentValues4 = new ContentValues();
/* 945 */                       contentValues4.put("event_id", Long.valueOf(jInsert2));
/* 956 */                       contentValues4.put("name", (String) entry.getKey());
/* 967 */                       contentValues4.put(FirebaseAnalytics.Param.VALUE, (String) entry.getValue());
/* 973 */                       sQLiteDatabase.insert("event_metadata", null, contentValues4);
                            }
/* 977 */                   return Long.valueOf(jInsert2);
                        case 5:
/* 327 */                   s52 s52Var3 = (s52) obj4;
/* 329 */                   ArrayList arrayList = (ArrayList) obj3;
/* 331 */                   C2497yg c2497yg2 = (C2497yg) obj2;
/* 335 */                   Cursor cursor2 = (Cursor) obj;
/* 341 */                   while (cursor2.moveToNext()) {
/* 344 */                       long j = cursor2.getLong(0);
/* 357 */                       int i11 = cursor2.getInt(7) != 0 ? i7 : 0;
/* 360 */                       xy1 xy1Var = new xy1();
/* 368 */                       xy1Var.f19398f = new HashMap();
/* 370 */                       String string = cursor2.getString(i7);
/* 374 */                       if (string == null) {
/* 607 */                           C1951n4.m6868s("Null transportName");
/* 603 */                           return null;
                                }
/* 376 */                       xy1Var.f19393a = string;
/* 386 */                       xy1Var.f19396d = Long.valueOf(cursor2.getLong(i6));
/* 397 */                       xy1Var.f19397e = Long.valueOf(cursor2.getLong(3));
/* 399 */                       if (i11 != 0) {
/* 404 */                           String string2 = cursor2.getString(4);
/* 428 */                           xy1Var.f19395c = new sd0(string2 == null ? s52.f16430f : new vd0(string2), cursor2.getBlob(5));
/* 430 */                           s52Var = s52Var3;
                                } else {
/* 441 */                           String string3 = cursor2.getString(4);
/* 452 */                           vd0 vd0Var = string3 == null ? s52.f16430f : new vd0(string3);
/* 482 */                           Cursor cursorQuery = s52Var3.m8404c().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num");
                                    try {
/* 488 */                               ArrayList arrayList2 = new ArrayList();
/* 491 */                               int length = 0;
/* 496 */                               while (cursorQuery.moveToNext()) {
/* 499 */                                   byte[] blob = cursorQuery.getBlob(0);
/* 503 */                                   arrayList2.add(blob);
/* 507 */                                   length += blob.length;
                                        }
/* 511 */                               byte[] bArr3 = new byte[length];
/* 513 */                               int i12 = 0;
/* 514 */                               int length2 = 0;
/* 521 */                               while (i12 < arrayList2.size()) {
/* 527 */                                   byte[] bArr4 = (byte[]) arrayList2.get(i12);
/* 529 */                                   s52 s52Var4 = s52Var3;
/* 532 */                                   cursor = cursorQuery;
                                            try {
/* 535 */                                       System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
/* 539 */                                       length2 += bArr4.length;
/* 540 */                                       i12++;
/* 542 */                                       cursorQuery = cursor;
/* 544 */                                       s52Var3 = s52Var4;
                                            } catch (Throwable th) {
/* 547 */                                       th = th;
/* 599 */                                       cursor.close();
/* 602 */                                       throw th;
                                            }
                                        }
/* 549 */                               s52Var = s52Var3;
/* 553 */                               cursorQuery.close();
/* 559 */                               xy1Var.f19395c = new sd0(vd0Var, bArr3);
                                    } catch (Throwable th2) {
/* 596 */                               th = th2;
/* 597 */                               cursor = cursorQuery;
                                    }
                                }
/* 566 */                       if (!cursor2.isNull(6)) {
/* 576 */                           xy1Var.f19394b = Integer.valueOf(cursor2.getInt(6));
                                }
/* 587 */                       arrayList.add(new C0990hg(j, c2497yg2, xy1Var.m10041d()));
/* 590 */                       s52Var3 = s52Var;
/* 592 */                       i6 = 2;
/* 593 */                       i7 = 1;
                            }
/* 611 */                   return null;
                        default:
/* 29 */                    s52 s52Var5 = (s52) obj4;
/* 31 */                    HashMap map = (HashMap) obj3;
/* 33 */                    ra2 ra2Var = (ra2) obj2;
/* 37 */                    ArrayList arrayList3 = (ArrayList) ra2Var.f15957c;
/* 41 */                    Cursor cursor3 = (Cursor) obj;
/* 43 */                    s52Var5.getClass();
/* 50 */                    while (cursor3.moveToNext()) {
/* 52 */                        String string4 = cursor3.getString(i8);
/* 56 */                        int i13 = cursor3.getInt(1);
/* 60 */                        ca1 ca1Var3 = ca1.REASON_UNKNOWN;
/* 62 */                        if (i13 != 0) {
/* 67 */                            if (i13 == 1) {
/* 69 */                                ca1Var3 = ca1.MESSAGE_TOO_OLD;
                                    } else if (i13 == 2) {
/* 74 */                                ca1Var = ca1Var2;
                                    } else if (i13 == i5) {
/* 78 */                                ca1Var3 = ca1.PAYLOAD_TOO_BIG;
                                    } else if (i13 == i4) {
/* 83 */                                ca1Var3 = ca1.MAX_RETRIES_REACHED;
                                    } else if (i13 == i3) {
/* 88 */                                ca1Var3 = ca1.INVALID_PAYLOD;
                                    } else if (i13 == i2) {
/* 93 */                                ca1Var3 = ca1.SERVER_ERROR;
                                    } else {
/* 104 */                               py0.m7593P("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i13));
                                    }
/* 64 */                            ca1Var = ca1Var3;
                                } else {
/* 64 */                            ca1Var = ca1Var3;
                                }
/* 108 */                       long j2 = cursor3.getLong(2);
/* 116 */                       if (!map.containsKey(string4)) {
/* 123 */                           map.put(string4, new ArrayList());
                                }
/* 137 */                       ((List) map.get(string4)).add(new da1(j2, ca1Var));
/* 140 */                       i2 = 6;
/* 141 */                       i3 = 5;
/* 142 */                       i4 = 4;
/* 143 */                       i5 = 3;
/* 144 */                       i8 = 0;
                            }
/* 158 */                   for (Map.Entry entry2 : map.entrySet()) {
/* 166 */                       int i14 = fa1.f8051c;
/* 170 */                       new ArrayList();
/* 194 */                       arrayList3.add(new fa1((String) entry2.getKey(), Collections.unmodifiableList((List) entry2.getValue())));
                            }
/* 200 */                   long jMo7340a = s52Var5.f16432b.mo7340a();
/* 204 */                   SQLiteDatabase sQLiteDatabaseM8404c = s52Var5.m8404c();
/* 208 */                   sQLiteDatabaseM8404c.beginTransaction();
                            try {
/* 216 */                       Cursor cursorRawQuery = sQLiteDatabaseM8404c.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                                try {
/* 220 */                           cursorRawQuery.moveToNext();
/* 229 */                           ko2 ko2Var = new ko2(cursorRawQuery.getLong(0), jMo7340a);
/* 232 */                           cursorRawQuery.close();
/* 235 */                           sQLiteDatabaseM8404c.setTransactionSuccessful();
/* 238 */                           sQLiteDatabaseM8404c.endTransaction();
/* 241 */                           ra2Var.f15956b = ko2Var;
/* 282 */                           ra2Var.f15958d = new hr0(new gh2(s52Var5.m8404c().compileStatement("PRAGMA page_size").simpleQueryForLong() * s52Var5.m8404c().compileStatement("PRAGMA page_count").simpleQueryForLong(), C2179sf.f16553f.f16554a));
/* 292 */                           ra2Var.f15955a = (String) s52Var5.f16435e.get();
/* 312 */                           return new C2232tv((ko2) ra2Var.f15956b, Collections.unmodifiableList(arrayList3), (hr0) ra2Var.f15958d, (String) ra2Var.f15955a);
                                } catch (Throwable th3) {
/* 319 */                           cursorRawQuery.close();
/* 322 */                           throw th3;
                                }
                            } catch (Throwable th4) {
/* 323 */                       sQLiteDatabaseM8404c.endTransaction();
/* 326 */                       throw th4;
                            }
                    }
                }

                @Override // io.sentry.InterfaceC1395c7
                /* JADX INFO: renamed from: b */
                public void mo5112b(C1162a7 c1162a7) {
                    C1176c c1176cM4777b;
/* 3 */             C1748x6 c1748x6 = (C1748x6) this.f15255b;
/* 7 */             InterfaceC1395c7 interfaceC1395c7 = (InterfaceC1395c7) this.f15256c;
/* 11 */            AtomicReference atomicReference = (AtomicReference) this.f15257d;
/* 13 */            if (interfaceC1395c7 != null) {
/* 15 */                interfaceC1395c7.mo5112b(c1162a7);
                    }
/* 20 */            C1184e c1184e = c1748x6.f11835r.f11098i;
/* 22 */            if (c1184e != null) {
/* 26 */                ActivityLifecycleIntegration activityLifecycleIntegration = (ActivityLifecycleIntegration) c1184e.f9997a;
/* 30 */                WeakReference weakReference = (WeakReference) c1184e.f9998b;
/* 34 */                String str = (String) c1184e.f9999c;
/* 40 */                Activity activity = (Activity) weakReference.get();
/* 42 */                if (activity != null) {
/* 44 */                    C1181d c1181d = activityLifecycleIntegration.f9829c0;
/* 46 */                    C1626w c1626wMo5247g = c1748x6.mo5247g();
/* 54 */                    C1702a c1702a = (C1702a) c1181d.f9990g;
/* 56 */                    c1702a.m5443c();
                            try {
/* 63 */                        if (c1181d.m4780e()) {
/* 76 */                            C1176c c1176c = null;
/* 77 */                            c1181d.m4782g(new RunnableC1173b(c1181d, activity, 1), null);
/* 88 */                            C1176c c1176c2 = (C1176c) ((WeakHashMap) c1181d.f9988e).remove(activity);
/* 90 */                            if (c1176c2 != null && (c1176cM4777b = c1181d.m4777b()) != null) {
/* 117 */                               c1176c = new C1176c(c1176cM4777b.f9972a - c1176c2.f9972a, c1176cM4777b.f9973b - c1176c2.f9973b, c1176cM4777b.f9974c - c1176c2.f9974c);
                                    }
/* 121 */                           if (c1176c != null) {
/* 123 */                               int i = c1176c.f9974c;
/* 125 */                               int i2 = c1176c.f9973b;
/* 127 */                               int i3 = c1176c.f9972a;
/* 129 */                               if (i3 != 0 || i2 != 0 || i != 0) {
/* 142 */                                   C1614n c1614n = new C1614n("none", (Number) Integer.valueOf(i3));
/* 151 */                                   C1614n c1614n2 = new C1614n("none", (Number) Integer.valueOf(i2));
/* 160 */                                   C1614n c1614n3 = new C1614n("none", (Number) Integer.valueOf(i));
/* 165 */                                   HashMap map = new HashMap();
/* 170 */                                   map.put("frames_total", c1614n);
/* 175 */                                   map.put("frames_slow", c1614n2);
/* 180 */                                   map.put("frames_frozen", c1614n3);
/* 187 */                                   ((ConcurrentHashMap) c1181d.f9987d).put(c1626wMo5247g, map);
                                        }
                                    }
                                }
/* 65 */                        c1702a.close();
                            } catch (Throwable th) {
                                try {
/* 192 */                           c1702a.close();
                                } catch (Throwable th2) {
/* 197 */                           th.addSuppressed(th2);
                                }
/* 200 */                       throw th;
                            }
                        } else {
/* 201 */                   SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f9830d;
/* 203 */                   if (sentryAndroidOptions != null) {
/* 217 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                            }
                        }
                    }
/* 220 */           InterfaceC1547m interfaceC1547m = c1748x6.f11834q;
/* 222 */           if (interfaceC1547m != null) {
/* 228 */               atomicReference.set(interfaceC1547m.mo5354f(c1748x6));
                    }
                }

                @Override // io.sentry.InterfaceC1159a4
                /* JADX INFO: renamed from: c */
                public void mo4715c(InterfaceC1549m1 interfaceC1549m1) {
/* 3 */             GestureDetectorOnGestureListenerC1205g gestureDetectorOnGestureListenerC1205g = (GestureDetectorOnGestureListenerC1205g) this.f15255b;
/* 7 */             InterfaceC1156a1 interfaceC1156a1 = (InterfaceC1156a1) this.f15256c;
/* 11 */            InterfaceC1549m1 interfaceC1549m2 = (InterfaceC1549m1) this.f15257d;
/* 13 */            if (interfaceC1549m1 == null) {
/* 15 */                interfaceC1156a1.mo4685I(interfaceC1549m2);
                    } else {
/* 37 */                gestureDetectorOnGestureListenerC1205g.f10090c.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC1549m2.getName());
                    }
                }

                @Override // p000.bk2
                public Object execute() {
/* 3 */             n60 n60Var = (n60) this.f15255b;
/* 7 */             C2497yg c2497yg = (C2497yg) this.f15256c;
/* 11 */            C2142rf c2142rf = (C2142rf) this.f15257d;
/* 13 */            s52 s52Var = n60Var.f14142d;
/* 15 */            s52Var.getClass();
/* 18 */            px1 px1Var = c2497yg.f19602c;
/* 31 */            if (Log.isLoggable(py0.m7607l0("SQLiteEventStore"), 3)) {
/* 40 */                new StringBuilder("Storing event with priority=").append(px1Var);
                    }
/* 55 */            ((Long) s52Var.m8405g(new C2080pr(4, s52Var, c2142rf, c2497yg))).getClass();
/* 62 */            n60Var.f14139a.m3372K(c2497yg, 1, false);
/* 65 */            return null;
                }

                @Override // com.google.android.gms.tasks.SuccessContinuation
                public Task then(Object obj) {
/* 3 */             FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.f15255b;
/* 7 */             String str = (String) this.f15256c;
/* 11 */            hh2 hh2Var = (hh2) this.f15257d;
/* 13 */            String str2 = (String) obj;
/* 17 */            xi1 xi1VarM2527c = FirebaseMessaging.m2527c(firebaseMessaging.f5298b);
/* 23 */            vi0 vi0Var = firebaseMessaging.f5297a;
/* 25 */            vi0Var.m9274a();
/* 39 */            String strM9276d = "[DEFAULT]".equals(vi0Var.f18193b) ? HttpUrl.FRAGMENT_ENCODE_SET : vi0Var.m9276d();
/* 45 */            String strM8662a = firebaseMessaging.f5304h.m8662a();
                    synchronized (xi1VarM2527c) {
/* 54 */                String strM4226c = hh2.m4226c(str2, System.currentTimeMillis(), strM8662a);
/* 58 */                if (strM4226c != null) {
/* 64 */                    SharedPreferences.Editor editorEdit = xi1VarM2527c.f19168a.edit();
/* 93 */                    editorEdit.putString(strM9276d + "|T|" + str + "|*", strM4226c);
/* 96 */                    editorEdit.commit();
                        }
                    }
/* 100 */           if (hh2Var == null || !str2.equals((String) hh2Var.f9083b)) {
/* 114 */               vi0 vi0Var2 = firebaseMessaging.f5297a;
/* 116 */               vi0Var2.m9274a();
/* 125 */               if ("[DEFAULT]".equals(vi0Var2.f18193b)) {
/* 134 */                   if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 136 */                       vi0Var2.m9274a();
                            }
/* 143 */                   Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
/* 148 */                   intent.putExtra("token", str2);
/* 159 */                   new C0210cb(firebaseMessaging.f5298b, 1).m1572F(intent);
                        }
                    }
/* 162 */           return Tasks.forResult(str2);
                }

                @Override // p000.InterfaceC2299vm
                /* JADX INFO: renamed from: w */
                public Object mo1148w(C2260um c2260um) {
/* 3 */             C2466xm c2466xm = (C2466xm) this.f15255b;
/* 7 */             y92 y92Var = (y92) this.f15256c;
/* 11 */            ArrayList arrayList = (ArrayList) this.f15257d;
/* 17 */            RunnableC2166s2 runnableC2166s2 = new RunnableC2166s2(c2466xm, 16);
/* 20 */            u32 u32Var = c2260um.f17592c;
/* 22 */            if (u32Var != null) {
/* 24 */                u32Var.mo3676a(runnableC2166s2, y92Var);
                    }
/* 38 */            c2466xm.mo3676a(new dp0(0, c2466xm, new d52(c2260um)), y92Var);
/* 56 */            return "surfaceList[" + arrayList + "]";
                }

                @Override // p000.InterfaceC2251ud
                /* JADX INFO: renamed from: apply */
/* 982 */       public s81 mo10660apply(Object obj) {
                    InputConfiguration inputConfiguration;
                    C2154rr c2154rr = (C2154rr) this.f15255b;
                    fb2 fb2Var = (fb2) this.f15256c;
                    CameraDevice cameraDevice = (CameraDevice) this.f15257d;
                    List list = (List) obj;
                    synchronized (c2154rr.f16232a) {
                        try {
/* 984 */                   int iM3520y = AbstractC0886en.m3520y(c2154rr.f16240i);
                            if (iM3520y != 0 && iM3520y != 1) {
                                if (iM3520y == 2) {
/* 988 */                           c2154rr.f16238g.clear();
/* 989 */                           for (int i = 0; i < list.size(); i++) {
/* 992 */                               c2154rr.f16238g.put((d70) c2154rr.f16239h.get(i), (Surface) list.get(i));
                                    }
/* 993 */                           c2154rr.f16240i = 4;
/* 995 */                           hu0.m4312F0("CaptureSession");
/* 999 */                           C2117qr c2117qr = new C2117qr(Arrays.asList(c2154rr.f16234c, new C2117qr(fb2Var.f8117d, 1)), 2);
/* 1001 */                          C1803jr c1803jr = fb2Var.f8120g;
/* 1003 */                          C0998ho c0998ho = new C0998ho(c1803jr.f12442b);
/* 1004 */                          HashSet hashSet = new HashSet();
/* 1005 */                          uk1.m9034j();
/* 1006 */                          ArrayList arrayList = new ArrayList();
/* 1007 */                          cl1.m1721a();
/* 1008 */                          hashSet.addAll(c1803jr.f12441a);
/* 1009 */                          uk1 uk1VarM9035m = uk1.m9035m(c1803jr.f12442b);
/* 1010 */                          int i2 = c1803jr.f12443c;
/* 1012 */                          arrayList.addAll(c1803jr.f12444d);
/* 1013 */                          boolean z = c1803jr.f12445e;
/* 1014 */                          nm2 nm2Var = c1803jr.f12446f;
/* 1015 */                          ArrayMap arrayMap = new ArrayMap();
                                    for (String str : nm2Var.f14383a.keySet()) {
/* 1020 */                              arrayMap.put(str, nm2Var.f14383a.get(str));
                                    }
/* 1022 */                          cl1 cl1Var = new cl1(arrayMap);
/* 1023 */                          ArrayList<oq1> arrayList2 = new ArrayList();
/* 1025 */                          String str2 = (String) ((InterfaceC2235ty) c0998ho.f7001a).mo7023b(C0998ho.f9164W, null);
                                    for (C1926mg c1926mg : fb2Var.f8114a) {
/* 1029 */                              oq1 oq1VarM8231d = c2154rr.m8231d(c1926mg, c2154rr.f16238g, str2);
                                        String str3 = str2;
                                        uk1 uk1Var = uk1VarM9035m;
/* 1032 */                              if (c2154rr.f16243l.containsKey(c1926mg.f13750a)) {
/* 1036 */                                  oq1VarM8231d.f14865a.mo7994i(((Long) c2154rr.f16243l.get(c1926mg.f13750a)).longValue());
                                        }
/* 1037 */                              arrayList2.add(oq1VarM8231d);
                                        str2 = str3;
                                        z = z;
                                        uk1VarM9035m = uk1Var;
                                    }
                                    uk1 uk1Var2 = uk1VarM9035m;
                                    boolean z2 = z;
/* 1038 */                          ArrayList arrayList3 = new ArrayList();
/* 1039 */                          ArrayList arrayList4 = new ArrayList();
                                    for (oq1 oq1Var : arrayList2) {
/* 1044 */                              if (!arrayList3.contains(((OutputConfiguration) oq1Var.f14865a.mo7988c()).getSurface())) {
/* 1048 */                                  arrayList3.add(((OutputConfiguration) oq1Var.f14865a.mo7988c()).getSurface());
/* 1049 */                                  arrayList4.add(oq1Var);
                                        }
                                    }
/* 1050 */                          gk2 gk2Var = c2154rr.f16235d;
/* 1051 */                          gk2Var.f8669f = c2117qr;
/* 1052 */                          kb2 kb2Var = new kb2(arrayList4, gk2Var.f8667d, new C0851dp(gk2Var, 1));
/* 1056 */                          if (fb2Var.f8120g.f12443c == 5 && (inputConfiguration = fb2Var.f8121h) != null) {
/* 1059 */                              kb2Var.f12673a.mo4157h(by0.m1468a(inputConfiguration));
                                    }
                                    try {
                                        ArrayList arrayList5 = new ArrayList(hashSet);
/* 1061 */                              nq1 nq1VarM7021d = nq1.m7021d(uk1Var2);
                                        ArrayList arrayList6 = new ArrayList(arrayList);
/* 1062 */                              nm2 nm2Var2 = nm2.f14382b;
/* 1063 */                              ArrayMap arrayMap2 = new ArrayMap();
                                        for (String str4 : cl1Var.f14383a.keySet()) {
/* 1068 */                                  arrayMap2.put(str4, cl1Var.f14383a.get(str4));
                                        }
/* 1072 */                              CaptureRequest captureRequestM5751k = jb1.m5751k(new C1803jr(arrayList5, nq1VarM7021d, i2, arrayList6, z2, new nm2(arrayMap2), null), cameraDevice, c2154rr.f16248q);
                                        if (captureRequestM5751k != null) {
/* 1073 */                                  kb2Var.f12673a.mo4156g(captureRequestM5751k);
                                        }
/* 1074 */                              return c2154rr.f16235d.m3960n(cameraDevice, kb2Var, c2154rr.f16239h);
                                    } catch (CameraAccessException e) {
/* 1075 */                              return new tw0(e, 1);
                                    }
                                }
                                if (iM3520y != 4) {
/* 986 */                           return new tw0(new CancellationException("openCaptureSession() not execute in state: ".concat(AbstractC0886en.m3494C(c2154rr.f16240i))), 1);
                                }
                            }
/* 1078 */                  return new tw0(new IllegalStateException("openCaptureSession() should not be possible in state: ".concat(AbstractC0886en.m3494C(c2154rr.f16240i))), 1);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
