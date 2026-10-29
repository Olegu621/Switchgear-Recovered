            package io.sentry.cache;

            import io.sentry.C1160a5;
            import io.sentry.C1486i0;
            import io.sentry.C1540l7;
            import io.sentry.C1664s4;
            import io.sentry.C1726v4;
            import io.sentry.C1764z6;
            import io.sentry.EnumC1538l5;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1756y6;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1487i1;
            import io.sentry.android.core.C1195h1;
            import io.sentry.android.core.C1285x1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.clientreport.EnumC1414d;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.hints.C1482j;
            import io.sentry.hints.InterfaceC1473a;
            import io.sentry.hints.InterfaceC1479g;
            import io.sentry.hints.InterfaceC1481i;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import java.io.BufferedInputStream;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.ByteArrayInputStream;
            import java.io.File;
            import java.io.FileInputStream;
            import java.io.FileNotFoundException;
            import java.io.FileOutputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.io.OutputStreamWriter;
            import java.nio.charset.Charset;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.Date;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import p000.kl0;
            
            /* JADX INFO: renamed from: io.sentry.cache.c */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class C1398c implements InterfaceC1399d {

                /* JADX INFO: renamed from: w */
                public static final Charset f10798w = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10799a;

                /* JADX INFO: renamed from: c */
                public final File f10801c;

                /* JADX INFO: renamed from: d */
                public final int f10802d;

                /* JADX INFO: renamed from: b */
                public final C1708g f10800b = new C1708g(new C1195h1(this, 6));

                /* JADX INFO: renamed from: f */
                public final WeakHashMap f10804f = new WeakHashMap();

                /* JADX INFO: renamed from: i */
                public final C1702a f10805i = new C1702a();

                /* JADX INFO: renamed from: v */
                public final C1702a f10806v = new C1702a();

                /* JADX INFO: renamed from: e */
                public final CountDownLatch f10803e = new CountDownLatch(1);

                public C1398c(SentryAndroidOptions sentryAndroidOptions, String str, int i) {
/* 17 */            this.f10799a = sentryAndroidOptions;
/* 24 */            this.f10801c = new File(str);
/* 26 */            this.f10802d = i;
                }

                /* JADX WARN: Code duplicated, block: B:201:0x0465  */
                /* JADX WARN: Code duplicated, block: B:28:0x0097 A[EDGE_INSN: B:28:0x0097->B:99:0x0205 BREAK  A[LOOP:2: B:36:0x00ae->B:98:0x01f6], PHI: r4 r6 r8 r15
  0x0097: PHI (r4v31 java.io.File[]) = 
  (r4v30 java.io.File[])
  (r4v30 java.io.File[])
  (r4v30 java.io.File[])
  (r4v30 java.io.File[])
  (r4v30 java.io.File[])
  (r4v30 java.io.File[])
  (r4v30 java.io.File[])
  (r4v34 java.io.File[])
 binds: [B:10:0x0048, B:12:0x0056, B:25:0x0089, B:27:0x0095, B:29:0x009f, B:31:0x00a3, B:33:0x00a9, B:287:0x0097] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r6v23 io.sentry.util.g) = 
  (r6v22 io.sentry.util.g)
  (r6v22 io.sentry.util.g)
  (r6v22 io.sentry.util.g)
  (r6v22 io.sentry.util.g)
  (r6v22 io.sentry.util.g)
  (r6v22 io.sentry.util.g)
  (r6v22 io.sentry.util.g)
  (r6v25 io.sentry.util.g)
 binds: [B:10:0x0048, B:12:0x0056, B:25:0x0089, B:27:0x0095, B:29:0x009f, B:31:0x00a3, B:33:0x00a9, B:287:0x0097] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r8v5 io.sentry.android.core.SentryAndroidOptions) = 
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v4 io.sentry.android.core.SentryAndroidOptions)
  (r8v7 io.sentry.android.core.SentryAndroidOptions)
 binds: [B:10:0x0048, B:12:0x0056, B:25:0x0089, B:27:0x0095, B:29:0x009f, B:31:0x00a3, B:33:0x00a9, B:287:0x0097] A[DONT_GENERATE, DONT_INLINE]
  0x0097: PHI (r15v20 ??) = (r15v21 ??), (r15v23 ??), (r15v25 ??), (r15v26 ??), (r15v26 ??), (r15v26 ??), (r15v26 ??), (r15v28 ??) binds: [B:10:0x0048, B:12:0x0056, B:25:0x0089, B:27:0x0095, B:29:0x009f, B:31:0x00a3, B:33:0x00a9, B:287:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v1 */
                /* JADX WARN: Type inference failed for: r15v10 */
                /* JADX WARN: Type inference failed for: r15v17 */
                /* JADX WARN: Type inference failed for: r15v18 */
                /* JADX WARN: Type inference failed for: r15v2 */
                /* JADX WARN: Type inference failed for: r15v20 */
                /* JADX WARN: Type inference failed for: r15v21 */
                /* JADX WARN: Type inference failed for: r15v23, types: [java.lang.Iterable] */
                /* JADX WARN: Type inference failed for: r15v24 */
                /* JADX WARN: Type inference failed for: r15v25 */
                /* JADX WARN: Type inference failed for: r15v26, types: [io.sentry.y6, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r15v27 */
                /* JADX WARN: Type inference failed for: r15v28, types: [int] */
                /* JADX WARN: Type inference failed for: r15v3 */
                /* JADX WARN: Type inference failed for: r15v30, types: [io.sentry.l5, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r15v31 */
                /* JADX WARN: Type inference failed for: r15v32 */
                /* JADX WARN: Type inference failed for: r15v33 */
                /* JADX WARN: Type inference failed for: r15v34 */
                /* JADX WARN: Type inference failed for: r15v35 */
                /* JADX WARN: Type inference failed for: r15v36 */
                /* JADX WARN: Type inference failed for: r15v37 */
                /* JADX WARN: Type inference failed for: r15v38 */
                /* JADX WARN: Type inference failed for: r15v39 */
                /* JADX WARN: Type inference failed for: r15v4 */
                /* JADX WARN: Type inference failed for: r15v40 */
                /* JADX WARN: Type inference failed for: r15v42 */
                /* JADX WARN: Type inference failed for: r15v5 */
                /* JADX WARN: Type inference failed for: r15v6 */
                /* JADX WARN: Type inference failed for: r15v7 */
                /* JADX WARN: Type inference failed for: r7v10 */
                /* JADX WARN: Type inference failed for: r7v8 */
                /* JADX WARN: Type inference failed for: r7v9 */
                /* JADX WARN: Type inference failed for: r9v10, types: [io.sentry.y6, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v21, types: [io.sentry.l5, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r9v3, types: [boolean] */
                /* JADX WARN: Type inference failed for: r9v4, types: [boolean] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // io.sentry.cache.InterfaceC1399d
                /* JADX INFO: renamed from: K */
                public boolean mo4775K(C1505c c1505c, C1486i0 c1486i0) {
                    ?? r15;
                    ?? r16;
                    Throwable th;
                    boolean z;
                    Date date;
                    boolean z2;
                    boolean z3;
                    ?? r7;
                    File[] fileArr;
                    C1764z6 c1764z6M5121e;
                    Boolean bool;
                    String str;
                    int i;
                    C1160a5 c1160a5M4719d;
                    C1764z6 c1764z6M5121e2;
                    boolean zEquals;
/* 9 */             AbstractC1704c.m5462q(c1505c, "Envelope is required.");
/* 12 */            File[] fileArrM5117a = m5117a();
/* 16 */            int length = fileArrM5117a.length;
/* 17 */            C1708g c1708g = this.f10800b;
/* 19 */            boolean z4 = false;
/* 20 */            SentryAndroidOptions sentryAndroidOptions = this.f10799a;
/* 23 */            int i2 = this.f10802d;
/* 25 */            if (length >= i2) {
/* 37 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
/* 42 */                int i3 = (length - i2) + 1;
/* 44 */                if (fileArrM5117a.length > 1) {
/* 52 */                    Arrays.sort(fileArrM5117a, new kl0(5));
                        }
/* 60 */                File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrM5117a, i3, length);
/* 62 */                int i4 = 0;
/* 63 */                while (i4 < i3) {
/* 65 */                    File file = fileArrM5117a[i4];
/* 67 */                    C1505c c1505cM5120d = m5120d(file);
/* 73 */                    if (c1505cM5120d == null) {
/* 152 */                       fileArr = fileArrM5117a;
/* 154 */                       c1708g = c1708g;
/* 156 */                       sentryAndroidOptions = sentryAndroidOptions;
                                r16 = r16;
                                break;
                            }
/* 77 */                    r16 = (Iterable) c1505cM5120d.f11043c;
/* 87 */                    if (!r16.iterator().hasNext()) {
/* 152 */                       fileArr = fileArrM5117a;
/* 154 */                       c1708g = c1708g;
/* 156 */                       sentryAndroidOptions = sentryAndroidOptions;
                                r16 = r16;
                                break;
                            }
/* 96 */                    sentryAndroidOptions.getClientReportRecorder().mo5159c(EnumC1414d.CACHE_OVERFLOW, c1505cM5120d);
/* 99 */                    Iterator it = r16.iterator();
                            while (true) {
/* 107 */                       if (!it.hasNext()) {
/* 137 */                           c1764z6M5121e = null;
                                    r16 = r16;
                                    break;
                                }
/* 113 */                       C1160a5 c1160a5 = (C1160a5) it.next();
/* 115 */                       if (c1160a5 == null) {
/* 117 */                           zEquals = z4;
                                } else {
/* 121 */                           ?? r9 = c1160a5.f9799a.f10744e;
/* 123 */                           r16 = EnumC1538l5.Session;
/* 125 */                           zEquals = r9.equals(r16);
                                }
/* 129 */                       if (zEquals) {
/* 132 */                           c1764z6M5121e = m5121e(c1160a5);
                                    r16 = r16;
                                    break;
                                }
                            }
/* 138 */                   if (c1764z6M5121e == null) {
/* 152 */                       fileArr = fileArrM5117a;
/* 154 */                       c1708g = c1708g;
/* 156 */                       sentryAndroidOptions = sentryAndroidOptions;
                                r16 = r16;
                                break;
                            }
/* 140 */                   String str2 = c1764z6M5121e.f11865e;
/* 142 */                   ?? r10 = c1764z6M5121e.f11867i;
/* 144 */                   r16 = EnumC1756y6.Ok;
/* 150 */                   if (!r10.equals(r16) || str2 == null || (bool = c1764z6M5121e.f11866f) == null || !bool.booleanValue()) {
/* 152 */                       fileArr = fileArrM5117a;
/* 154 */                       c1708g = c1708g;
/* 156 */                       sentryAndroidOptions = sentryAndroidOptions;
                                r16 = r16;
                                break;
                            }
/* 173 */                   int length2 = fileArr2.length;
/* 174 */                   r16 = z4;
                            while (true) {
/* 175 */                       if (r16 >= length2) {
/* 152 */                           fileArr = fileArrM5117a;
/* 154 */                           c1708g = c1708g;
/* 156 */                           sentryAndroidOptions = sentryAndroidOptions;
                                    r16 = r16;
                                    break;
                                }
/* 177 */                       File file2 = fileArr2[r16];
/* 179 */                       fileArr = fileArrM5117a;
/* 181 */                       C1505c c1505cM5120d2 = m5120d(file2);
/* 185 */                       if (c1505cM5120d2 != null) {
/* 191 */                           Iterable iterable = (Iterable) c1505cM5120d2.f11043c;
/* 201 */                           if (iterable.iterator().hasNext()) {
/* 213 */                               Iterator it2 = iterable.iterator();
                                        while (true) {
/* 221 */                                   if (!it2.hasNext()) {
/* 382 */                                       str = str2;
/* 384 */                                       c1708g = c1708g;
/* 386 */                                       sentryAndroidOptions = sentryAndroidOptions;
/* 388 */                                       i = length2;
/* 390 */                                       c1160a5M4719d = null;
                                                break;
                                            }
/* 227 */                                   it2 = it2;
/* 231 */                                   C1160a5 c1160a6 = (C1160a5) it2.next();
/* 255 */                                   if ((c1160a6 == null ? false : c1160a6.f9799a.f10744e.equals(EnumC1538l5.Session)) && (c1764z6M5121e2 = m5121e(c1160a6)) != null) {
/* 270 */                                       String str3 = c1764z6M5121e2.f11865e;
/* 274 */                                       i = length2;
/* 282 */                                       if (c1764z6M5121e2.f11867i.equals(EnumC1756y6.Ok) && str3 != null) {
/* 287 */                                           Boolean bool2 = c1764z6M5121e2.f11866f;
/* 289 */                                           if (bool2 != null && bool2.booleanValue()) {
/* 309 */                                               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.ERROR, "Session %s has 2 times the init flag.", str2);
                                                        r16 = r16;
                                                        break;
                                                    }
/* 314 */                                           if (str2 != null && str2.equals(str3)) {
/* 324 */                                               c1764z6M5121e2.f11866f = Boolean.TRUE;
                                                        try {
/* 332 */                                                   c1160a5M4719d = C1160a5.m4719d((InterfaceC1487i1) c1708g.m5471a(), c1764z6M5121e2);
                                                            try {
/* 336 */                                                       it2.remove();
/* 339 */                                                       str = str2;
                                                                break;
                                                            } catch (IOException e) {
/* 342 */                                                       e = e;
/* 352 */                                                       str = str2;
/* 362 */                                                       sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, e, "Failed to create new envelope item for the session %s", str);
/* 365 */                                                       c1160a5M4719d = c1160a5M4719d;
                                                                break;
                                                            }
                                                        } catch (IOException e2) {
/* 344 */                                                   e = e2;
/* 345 */                                                   c1160a5M4719d = null;
                                                        }
                                                    }
                                                }
/* 376 */                                       length2 = i;
/* 378 */                                       str2 = str2;
                                            }
                                        }
/* 391 */                               if (c1160a5M4719d != null) {
/* 395 */                                   ArrayList arrayList = new ArrayList();
/* 398 */                                   Iterator it3 = iterable.iterator();
/* 406 */                                   while (it3.hasNext()) {
/* 414 */                                       arrayList.add((C1160a5) it3.next());
                                            }
/* 418 */                                   arrayList.add(c1160a5M4719d);
/* 427 */                                   C1505c c1505c2 = new C1505c((C1726v4) c1505cM5120d2.f11042b, arrayList);
/* 430 */                                   long jLastModified = file2.lastModified();
/* 438 */                                   if (!file2.delete()) {
/* 454 */                                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                                            }
                                            try {
/* 459 */                                       FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                                try {
/* 468 */                                           ((InterfaceC1487i1) c1708g.m5471a()).mo5067e(c1505c2, fileOutputStream);
/* 471 */                                           file2.setLastModified(jLastModified);
/* 474 */                                           fileOutputStream.close();
                                                    r16 = r16;
                                                    break;
                                                } catch (Throwable th2) {
                                                    try {
/* 482 */                                               fileOutputStream.close();
                                                    } catch (Throwable th3) {
/* 487 */                                               th2.addSuppressed(th3);
                                                    }
/* 490 */                                           throw th2;
                                                }
                                            } catch (Throwable th4) {
/* 499 */                                       sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to serialize the new envelope to the disk.", th4);
                                                r16 = r16;
                                                break;
                                            }
                                        }
                                    } else {
/* 203 */                               str = str2;
/* 205 */                               c1708g = c1708g;
/* 207 */                               sentryAndroidOptions = sentryAndroidOptions;
/* 209 */                               i = length2;
                                    }
                                } else {
/* 203 */                           str = str2;
/* 205 */                           c1708g = c1708g;
/* 207 */                           sentryAndroidOptions = sentryAndroidOptions;
/* 209 */                           i = length2;
                                }
/* 505 */                       fileArrM5117a = fileArr;
/* 507 */                       c1708g = c1708g;
/* 509 */                       sentryAndroidOptions = sentryAndroidOptions;
/* 511 */                       length2 = i;
/* 513 */                       str2 = str;
/* 503 */                       r16++;
                            }
/* 522 */                   if (!file.delete()) {
/* 538 */                       sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                            }
/* 541 */                   i4++;
/* 543 */                   fileArrM5117a = fileArr;
/* 545 */                   c1708g = c1708g;
/* 547 */                   sentryAndroidOptions = sentryAndroidOptions;
/* 549 */                   z4 = false;
                        }
                    }
/* 553 */           C1708g c1708g2 = c1708g;
/* 555 */           SentryAndroidOptions sentryAndroidOptions2 = sentryAndroidOptions;
/* 557 */           File file3 = this.f10801c;
/* 567 */           File file4 = new File(file3.getAbsolutePath(), "session.json");
/* 578 */           File file5 = new File(file3.getAbsolutePath(), "previous_session.json");
/* 587 */           if (AbstractC1704c.m5454i(c1486i0, InterfaceC1481i.class) && !file4.delete()) {
/* 606 */               sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "Current envelope doesn't exist.", new Object[0]);
                    }
/* 617 */           boolean zIsInstance = InterfaceC1473a.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"));
/* 623 */           Charset charset = f10798w;
/* 625 */           if (zIsInstance || InterfaceC1479g.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
/* 643 */               Object objM5273b = c1486i0.m5273b("sentry:typeCheckHint");
/* 653 */               File file6 = new File(file3.getAbsolutePath(), "previous_session.json");
/* 660 */               if (file6.exists()) {
/* 662 */                   ILogger logger = sentryAndroidOptions2.getLogger();
/* 666 */                   EnumC1553m5 enumC1553m5 = EnumC1553m5.WARNING;
/* 673 */                   logger.mo4672k(enumC1553m5, "Previous session is not ended, we'd need to end it.", new Object[0]);
                            try {
                                try {
/* 688 */                           BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                                    try {
/* 701 */                               C1764z6 c1764z6 = (C1764z6) ((InterfaceC1487i1) c1708g2.m5471a()).mo5064b(bufferedReader, C1764z6.class);
/* 703 */                               if (c1764z6 != null) {
/* 705 */                                   Date date2 = c1764z6.f11860a;
                                            try {
/* 709 */                                       if (objM5273b instanceof InterfaceC1473a) {
                                                    try {
/* 711 */                                               InterfaceC1473a interfaceC1473a = (InterfaceC1473a) objM5273b;
/* 713 */                                               Long lMo4960b = interfaceC1473a.mo4960b();
/* 717 */                                               if (lMo4960b != null) {
/* 727 */                                                   date = new Date(lMo4960b.longValue());
/* 730 */                                                   if (date2 != null) {
/* 736 */                                                       if (date.before(date2)) {
                                                                }
                                                            }
/* 753 */                                                   sentryAndroidOptions2.getLogger().mo4672k(enumC1553m5, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
/* 756 */                                                   bufferedReader.close();
/* 640 */                                                   r15 = 1;
                                                        } else {
/* 765 */                                                   date = null;
                                                        }
/* 774 */                                               c1764z6.m5528c(EnumC1756y6.Abnormal, null, true, interfaceC1473a.mo4962e());
/* 777 */                                               z2 = true;
                                                    } catch (Throwable th5) {
/* 740 */                                               th = th5;
/* 741 */                                               r16 = 1;
                                                        try {
/* 848 */                                                   bufferedReader.close();
/* 856 */                                                   throw th;
                                                        } catch (Throwable th6) {
/* 853 */                                                   th.addSuppressed(th6);
/* 856 */                                                   throw th;
                                                        }
                                                    }
                                                } else if (objM5273b instanceof InterfaceC1479g) {
/* 791 */                                           date = new Date(((C1285x1) ((InterfaceC1479g) objM5273b)).f10387d);
/* 794 */                                           if (date2 == null || date.before(date2)) {
/* 802 */                                               z = true;
/* 827 */                                               sentryAndroidOptions2.getLogger().mo4672k(enumC1553m5, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                                    } else {
/* 807 */                                               z2 = true;
/* 808 */                                               c1764z6.m5528c(EnumC1756y6.Crashed, null, true, null);
                                                    }
                                                } else {
/* 837 */                                           z2 = true;
/* 838 */                                           date = null;
                                                }
/* 839 */                                       c1764z6.m5527b(date);
/* 842 */                                       m5123g(file6, c1764z6);
                                                z = z2;
                                            } catch (Throwable th7) {
/* 812 */                                       th = th7;
/* 813 */                                       th = th;
                                                r16 = r16;
/* 848 */                                       bufferedReader.close();
/* 856 */                                       throw th;
                                            }
                                        } else {
/* 846 */                                   z = true;
                                        }
/* 830 */                               bufferedReader.close();
                                        r15 = z;
                                    } catch (Throwable th8) {
/* 815 */                               th = th8;
/* 816 */                               r16 = 1;
                                    }
                                } catch (Throwable th9) {
/* 834 */                           th = th9;
/* 865 */                           sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error processing previous session.", th);
                                    r15 = r16;
                                }
                            } catch (Throwable th10) {
/* 760 */                       th = th10;
/* 761 */                       r16 = 1;
/* 865 */                       sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error processing previous session.", th);
                                r15 = r16;
                            }
                        } else {
/* 869 */                   r15 = 1;
/* 881 */                   sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.DEBUG, "No previous session file to end.", new Object[0]);
                        }
                    } else {
/* 640 */               r15 = 1;
                    }
/* 896 */           if (C1482j.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
/* 898 */               m5119c(file4, file5);
/* 903 */               Iterable iterable2 = (Iterable) c1505c.f11043c;
/* 913 */               if (iterable2.iterator().hasNext()) {
/* 923 */                   C1160a5 c1160a7 = (C1160a5) iterable2.iterator().next();
/* 925 */                   EnumC1538l5 enumC1538l5 = EnumC1538l5.Session;
/* 929 */                   EnumC1538l5 enumC1538l6 = c1160a7.f9799a.f10744e;
/* 935 */                   if (enumC1538l5.equals(enumC1538l6)) {
                                try {
/* 953 */                           BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1160a7.m4722f()), charset));
                                    try {
/* 966 */                               C1764z6 c1764z7 = (C1764z6) ((InterfaceC1487i1) c1708g2.m5471a()).mo5064b(bufferedReader2, C1764z6.class);
/* 968 */                               if (c1764z7 == null) {
/* 982 */                                   sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.ERROR, "Item of type %s returned null by the parser.", enumC1538l6);
                                        } else {
/* 989 */                                   m5123g(file4, c1764z7);
                                        }
/* 992 */                               bufferedReader2.close();
                                    } catch (Throwable th11) {
                                        try {
/* 998 */                                   bufferedReader2.close();
/* 1006 */                                  throw th11;
                                        } catch (Throwable th12) {
/* 1003 */                                  th11.addSuppressed(th12);
/* 1006 */                                  throw th11;
                                        }
                                    }
                                } catch (Throwable th13) {
/* 1015 */                          sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Item failed to process.", th13);
                                }
                            } else {
/* 1031 */                      sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.INFO, "Current envelope has a different envelope type %s", enumC1538l6);
                            }
                        } else {
/* 1051 */                  sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.INFO, "Current envelope %s is empty", file4.getAbsolutePath());
                        }
/* 1069 */              if (new File(sentryAndroidOptions2.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
/* 1126 */                  z3 = false;
                        } else {
/* 1077 */                  File file7 = new File(sentryAndroidOptions2.getCacheDirPath(), "last_crash");
/* 1084 */                  if (file7.exists()) {
/* 1094 */                      z3 = false;
/* 1097 */                      sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
/* 1104 */                      if (!file7.delete()) {
/* 1122 */                          sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                                }
                            } else {
/* 1126 */                      z3 = false;
                            }
                        }
/* 1129 */              C1664s4.f11649c.m5403a();
/* 1134 */              this.f10803e.countDown();
                    } else {
/* 1138 */              z3 = false;
                    }
/* 1139 */          File fileM5118b = m5118b(c1505c);
/* 1147 */          if (fileM5118b.exists()) {
/* 1165 */              sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileM5118b.getAbsolutePath());
/* 1168 */              return r15;
                    }
/* 1171 */          ILogger logger2 = sentryAndroidOptions2.getLogger();
/* 1175 */          EnumC1553m5 enumC1553m6 = EnumC1553m5.DEBUG;
/* 1187 */          logger2.mo4672k(enumC1553m6, "Adding Envelope to offline storage: %s", fileM5118b.getAbsolutePath());
/* 1194 */          if (fileM5118b.exists()) {
/* 1210 */              sentryAndroidOptions2.getLogger().mo4672k(enumC1553m6, "Overwriting envelope to offline storage: %s", fileM5118b.getAbsolutePath());
/* 1217 */              if (!fileM5118b.delete()) {
/* 1235 */                  sentryAndroidOptions2.getLogger().mo4672k(EnumC1553m5.ERROR, "Failed to delete: %s", fileM5118b.getAbsolutePath());
                        }
                    }
                    try {
/* 1240 */              FileOutputStream fileOutputStream2 = new FileOutputStream(fileM5118b);
                        try {
/* 1249 */                  ((InterfaceC1487i1) c1708g2.m5471a()).mo5067e(c1505c, fileOutputStream2);
/* 1252 */                  fileOutputStream2.close();
/* 1255 */                  r7 = r15;
/* 1300 */                  if (C1540l7.class.isInstance(c1486i0.m5273b("sentry:typeCheckHint"))) {
                                try {
/* 1313 */                          FileOutputStream fileOutputStream3 = new FileOutputStream(new File(sentryAndroidOptions2.getCacheDirPath(), "last_crash"));
                                    try {
/* 1333 */                              fileOutputStream3.write(AbstractC1417a.m5178q(new Date().getTime()).getBytes(charset));
/* 1336 */                              fileOutputStream3.flush();
/* 1339 */                              fileOutputStream3.close();
                                    } catch (Throwable th14) {
                                        try {
/* 1347 */                                  fileOutputStream3.close();
/* 1355 */                                  throw th14;
                                        } catch (Throwable th15) {
/* 1352 */                                  th14.addSuppressed(th15);
/* 1355 */                                  throw th14;
                                        }
                                    }
                                } catch (Throwable th16) {
/* 1364 */                          sentryAndroidOptions2.getLogger().mo4671d(EnumC1553m5.ERROR, "Error writing the crash marker file to the disk", th16);
                                }
                            }
/* 1367 */                  return r7;
                        } catch (Throwable th17) {
                            try {
/* 1261 */                      fileOutputStream2.close();
/* 1269 */                      throw th17;
                            } catch (Throwable th18) {
/* 1266 */                      th17.addSuppressed(th18);
/* 1269 */                      throw th17;
                            }
                        }
                    } catch (Throwable th19) {
/* 1286 */              sentryAndroidOptions2.getLogger().mo4670b(EnumC1553m5.ERROR, th19, "Error writing Envelope %s to offline storage", fileM5118b.getAbsolutePath());
/* 1289 */              r7 = z3;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final File[] m5117a() {
/* 1 */             File file = this.f10801c;
/* 7 */             if (file.isDirectory() && file.canWrite() && file.canRead()) {
/* 27 */                File[] fileArrListFiles = file.listFiles(new C1397b());
/* 31 */                if (fileArrListFiles != null) {
/* 33 */                    return fileArrListFiles;
                        }
                    } else {
/* 52 */                this.f10799a.getLogger().mo4672k(EnumC1553m5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
                    }
/* 56 */            return new File[0];
                }

                /* JADX INFO: renamed from: b */
                public final File m5118b(C1505c c1505c) {
                    String str;
/* 1 */             WeakHashMap weakHashMap = this.f10804f;
/* 5 */             C1702a c1702a = this.f10805i;
/* 7 */             c1702a.m5443c();
                    try {
/* 14 */                if (weakHashMap.containsKey(c1505c)) {
/* 20 */                    str = (String) weakHashMap.get(c1505c);
                        } else {
/* 29 */                    String strConcat = AbstractC1417a.m5172j().concat(".envelope");
/* 33 */                    weakHashMap.put(c1505c, strConcat);
/* 36 */                    str = strConcat;
                        }
/* 45 */                File file = new File(this.f10801c.getAbsolutePath(), str);
/* 48 */                c1702a.close();
/* 51 */                return file;
                    } catch (Throwable th) {
                        try {
/* 52 */                    c1702a.close();
                        } catch (Throwable th2) {
/* 57 */                    th.addSuppressed(th2);
                        }
/* 60 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m5119c(File file, File file2) {
/* 1 */             C1702a c1702a = this.f10806v;
/* 3 */             c1702a.m5443c();
                    try {
/* 10 */                if (!file.exists()) {
/* 12 */                    c1702a.close();
/* 15 */                    return;
                        }
/* 16 */                boolean zExists = file2.exists();
/* 21 */                SentryAndroidOptions sentryAndroidOptions = this.f10799a;
/* 23 */                if (zExists) {
/* 35 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
/* 42 */                    if (!file2.delete()) {
/* 56 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Unable to delete previous session file: %s", file2);
                            }
                        }
/* 72 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Moving current session to previous session.", new Object[0]);
                        try {
/* 79 */                    if (!file.renameTo(file2)) {
/* 91 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                            }
                        } catch (Throwable th) {
/* 104 */                   sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error moving current session to previous session.", th);
                        }
/* 107 */               c1702a.close();
                    } catch (Throwable th2) {
                        try {
/* 111 */                   c1702a.close();
                        } catch (Throwable th3) {
/* 116 */                   th2.addSuppressed(th3);
                        }
/* 119 */               throw th2;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final C1505c m5120d(File file) {
                    try {
/* 8 */                 BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                        try {
/* 19 */                    C1505c c1505cMo5065c = ((InterfaceC1487i1) this.f10800b.m5471a()).mo5065c(bufferedInputStream);
/* 23 */                    bufferedInputStream.close();
/* 26 */                    return c1505cMo5065c;
                        } catch (Throwable th) {
                            try {
/* 30 */                        bufferedInputStream.close();
                            } catch (Throwable th2) {
/* 35 */                        th.addSuppressed(th2);
                            }
/* 38 */                    throw th;
                        }
                    } catch (IOException e) {
/* 49 */                this.f10799a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to deserialize the envelope.", e);
/* 52 */                return null;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final C1764z6 m5121e(C1160a5 c1160a5) {
                    try {
/* 19 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(c1160a5.m4722f()), f10798w));
                        try {
/* 36 */                    C1764z6 c1764z6 = (C1764z6) ((InterfaceC1487i1) this.f10800b.m5471a()).mo5064b(bufferedReader, C1764z6.class);
/* 38 */                    bufferedReader.close();
/* 41 */                    return c1764z6;
                        } catch (Throwable th) {
                            try {
/* 45 */                        bufferedReader.close();
                            } catch (Throwable th2) {
/* 50 */                        th.addSuppressed(th2);
                            }
/* 53 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 64 */                this.f10799a.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to deserialize the session.", th3);
/* 67 */                return null;
                    }
                }

                /* JADX INFO: renamed from: f */
                public final boolean m5122f() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10799a;
                    try {
/* 11 */                return this.f10803e.await(sentryAndroidOptions.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
                    } catch (InterruptedException unused) {
/* 20 */                Thread.currentThread().interrupt();
/* 34 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
/* 31 */                return false;
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m5123g(File file, C1764z6 c1764z6) {
/* 1 */             String str = c1764z6.f11865e;
/* 3 */             SentryAndroidOptions sentryAndroidOptions = this.f10799a;
                    try {
/* 7 */                 FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
/* 19 */                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, f10798w));
                            try {
/* 34 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Overwriting session to offline storage: %s", str);
/* 45 */                        ((InterfaceC1487i1) this.f10800b.m5471a()).mo5063a(bufferedWriter, c1764z6);
/* 48 */                        bufferedWriter.close();
/* 51 */                        fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
/* 60 */                            bufferedWriter.close();
                                } catch (Throwable th2) {
/* 65 */                            th.addSuppressed(th2);
                                }
/* 68 */                        throw th;
                            }
                        } catch (Throwable th3) {
                            try {
/* 69 */                        fileOutputStream.close();
                            } catch (Throwable th4) {
/* 74 */                        th3.addSuppressed(th4);
                            }
/* 77 */                    throw th3;
                        }
                    } catch (Throwable th5) {
/* 90 */                sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th5, "Error writing Session to offline storage: %s", str);
                    }
                }

                @Override // java.lang.Iterable
                public final Iterator iterator() {
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10799a;
/* 3 */             File[] fileArrM5117a = m5117a();
/* 10 */            ArrayList arrayList = new ArrayList(fileArrM5117a.length);
/* 15 */            for (File file : fileArrM5117a) {
                        try {
/* 26 */                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                            try {
/* 41 */                        arrayList.add(((InterfaceC1487i1) this.f10800b.m5471a()).mo5065c(bufferedInputStream));
/* 44 */                        bufferedInputStream.close();
                            } catch (Throwable th) {
                                try {
/* 51 */                            bufferedInputStream.close();
                                } catch (Throwable th2) {
/* 56 */                            th.addSuppressed(th2);
                                }
/* 59 */                        throw th;
                            }
                        } catch (FileNotFoundException unused) {
/* 104 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
                        } catch (IOException e) {
/* 84 */                    sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
                        }
                    }
/* 110 */           return arrayList.iterator();
                }

                @Override // io.sentry.cache.InterfaceC1399d
                /* JADX INFO: renamed from: w1 */
                public final void mo5124w1(C1505c c1505c) {
/* 3 */             AbstractC1704c.m5462q(c1505c, "Envelope is required.");
/* 6 */             File fileM5118b = m5118b(c1505c);
/* 10 */            boolean zDelete = fileM5118b.delete();
/* 14 */            SentryAndroidOptions sentryAndroidOptions = this.f10799a;
/* 16 */            if (zDelete) {
/* 34 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Discarding envelope from cache: %s", fileM5118b.getAbsolutePath());
                    } else {
/* 54 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Envelope was not cached or could not be deleted: %s", fileM5118b.getAbsolutePath());
                    }
                }
            }
