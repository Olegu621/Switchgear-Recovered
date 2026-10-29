            package io.sentry;

            import android.os.Build;
            import android.os.Handler;
            import android.os.Looper;
            import android.text.Layout;
            import android.text.Spanned;
            import android.text.style.ForegroundColorSpan;
            import io.sentry.android.core.AbstractC1275u0;
            import io.sentry.android.core.C1248o0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.C1297c;
            import io.sentry.android.replay.util.InterfaceC1358l;
            import io.sentry.cache.C1401f;
            import io.sentry.cache.tape.InterfaceC1406e;
            import io.sentry.featureflags.InterfaceC1453b;
            import io.sentry.protocol.C1590a0;
            import io.sentry.protocol.C1593c;
            import io.sentry.protocol.C1607j;
            import io.sentry.transport.C1691q;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1708g;
            import java.io.BufferedReader;
            import java.io.BufferedWriter;
            import java.io.ByteArrayInputStream;
            import java.io.IOException;
            import java.io.InputStreamReader;
            import java.io.OutputStream;
            import java.io.OutputStreamWriter;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: io.sentry.s6 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class C1666s6 implements InterfaceC1747x5, InterfaceC1358l, InterfaceC1406e, InterfaceC1453b {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f11661a;

                /* JADX INFO: renamed from: b */
                public Object f11662b;

                public C1666s6(int i) {
/* 1 */             this.f11661a = i;
                    switch (i) {
                        case 2:
/* 78 */                    this.f11662b = new C1248o0(C1641r2.f11545a);
                            break;
                        case 5:
/* 50 */                    Looper mainLooper = Looper.getMainLooper();
/* 54 */                    mainLooper.getClass();
/* 65 */                    this.f11662b = new Handler(mainLooper);
                            break;
                        case 7:
/* 47 */                    this.f11662b = new C1708g(new C1697u2(21));
                            break;
                        case 8:
/* 29 */                    this.f11662b = new C1702a();
                            break;
                        case 9:
/* 18 */                    this.f11662b = new C1691q();
                            break;
                    }
                }

                /* JADX INFO: renamed from: n */
                public static Boolean m5404n(String str, List list, List list2) {
/* 1 */             if (str == null || str.isEmpty()) {
/* 62 */                return Boolean.TRUE;
                    }
/* 10 */            Iterator it = list.iterator();
/* 18 */            while (it.hasNext()) {
/* 30 */                if (str.startsWith((String) it.next())) {
/* 32 */                    return Boolean.TRUE;
                        }
                    }
/* 35 */            Iterator it2 = list2.iterator();
/* 43 */            while (it2.hasNext()) {
/* 55 */                if (str.startsWith((String) it2.next())) {
/* 57 */                    return Boolean.FALSE;
                        }
                    }
/* 60 */            return null;
                }

                /* JADX INFO: renamed from: o */
                public static Long m5405o(String str) {
/* 1 */             String strTrim = str.trim();
                    try {
/* 12 */                if (strTrim.endsWith("GB")) {
/* 32 */                    return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1073741824);
                        }
/* 43 */                if (strTrim.endsWith("MB")) {
/* 63 */                    return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1048576);
                        }
/* 74 */                if (strTrim.endsWith("KB")) {
/* 93 */                    return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 2)) * 1024);
                        }
/* 104 */               if (strTrim.endsWith("B")) {
/* 120 */                   return Long.valueOf(Long.parseLong(strTrim.substring(0, strTrim.length() - 1)));
                        }
/* 125 */               return null;
                    } catch (NumberFormatException unused) {
/* 125 */               return null;
                    }
                }

                /* JADX INFO: renamed from: p */
                public static Double m5406p(String str) {
/* 1 */             String strTrim = str.trim();
                    try {
/* 11 */                if (strTrim.equals("0")) {
/* 15 */                    return Double.valueOf(0.0d);
                        }
/* 27 */                if (strTrim.endsWith("ms")) {
/* 43 */                    return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)));
                        }
/* 54 */                if (strTrim.endsWith("ns")) {
/* 76 */                    return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000000.0d);
                        }
/* 92 */                if (strTrim.endsWith("us")) {
/* 109 */                   return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 2)) / 1000.0d);
                        }
/* 120 */               if (strTrim.endsWith("s")) {
/* 137 */                   return Double.valueOf(Double.parseDouble(strTrim.substring(0, strTrim.length() - 1)) * 1000.0d);
                        }
/* 142 */               return null;
                    } catch (NumberFormatException unused) {
/* 142 */               return null;
                    }
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: a */
                public int mo5029a(int i) {
/* 5 */             return ((Layout) this.f11662b).getLineTop(i);
                }

                @Override // io.sentry.InterfaceC1747x5
                /* JADX INFO: renamed from: b */
                public C1443f mo3667b(C1443f c1443f, C1486i0 c1486i0) {
/* 1 */             c1443f.getClass();
/* 6 */             InterfaceC1747x5 interfaceC1747x5 = (InterfaceC1747x5) this.f11662b;
/* 8 */             if (interfaceC1747x5 != null) {
/* 10 */                c1443f = interfaceC1747x5.mo3667b(c1443f, c1486i0);
                    }
/* 14 */            if (c1443f == null || !(Intrinsics.m6216a(c1443f.f10930e, "http") || Intrinsics.m6216a(c1443f.f10932i, "http"))) {
/* 34 */                return c1443f;
                    }
/* 37 */            c1486i0.m5273b("sentry:replayNetworkDetails");
/* 40 */            return c1443f;
                }

                @Override // io.sentry.cache.tape.InterfaceC1406e
                /* JADX INFO: renamed from: c */
                public void mo5132c(Object obj, OutputStream outputStream) throws IOException {
/* 1 */             C1443f c1443f = (C1443f) obj;
/* 12 */            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C1401f.f10808c));
                    try {
/* 25 */                ((C1401f) this.f11662b).f10809a.getSerializer().mo5063a(bufferedWriter, c1443f);
/* 28 */                bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
/* 33 */                    bufferedWriter.close();
                        } catch (Throwable th2) {
/* 38 */                    th.addSuppressed(th2);
                        }
/* 41 */                throw th;
                    }
                }

                @Override // io.sentry.featureflags.InterfaceC1453b
                public void clear() {
/* 3 */             C1702a c1702a = (C1702a) this.f11662b;
/* 5 */             c1702a.m5443c();
/* 8 */             c1702a.close();
                }

                /* JADX INFO: renamed from: clone, reason: collision with other method in class */
                public Object m10497clone() {
                    switch (this.f11661a) {
                        case 8:
/* 15 */                    return new C1666s6(8);
                        default:
/* 6 */                     return super.clone();
                    }
                }

                @Override // io.sentry.cache.tape.InterfaceC1406e
                /* JADX INFO: renamed from: d */
                public Object mo5133d(byte[] bArr) {
/* 5 */             SentryAndroidOptions sentryAndroidOptions = ((C1401f) this.f11662b).f10809a;
                    try {
/* 21 */                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), C1401f.f10808c));
                        try {
/* 34 */                    C1443f c1443f = (C1443f) sentryAndroidOptions.getSerializer().mo5064b(bufferedReader, C1443f.class);
/* 36 */                    bufferedReader.close();
/* 39 */                    return c1443f;
                        } catch (Throwable th) {
                            try {
/* 43 */                        bufferedReader.close();
                            } catch (Throwable th2) {
/* 48 */                        th.addSuppressed(th2);
                            }
/* 51 */                    throw th;
                        }
                    } catch (Throwable th3) {
/* 63 */                sentryAndroidOptions.getLogger().mo4670b(EnumC1553m5.ERROR, th3, "Error reading entity from scope cache", new Object[0]);
/* 66 */                return null;
                    }
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: e */
                public int mo5031e(int i) {
/* 5 */             return ((Layout) this.f11662b).getLineBottom(i);
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: f */
                public int mo5032f() {
/* 5 */             return ((Layout) this.f11662b).getLineCount();
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: g */
                public float mo5033g(int i) {
/* 3 */             Layout layout = (Layout) this.f11662b;
                    return (layout.getEllipsizedWidth() <= 0 || layout.getEllipsizedWidth() >= layout.getWidth()) ? layout.getLineRight(i) : layout.getEllipsizedWidth();
                }

                @Override // io.sentry.featureflags.InterfaceC1453b
                /* JADX INFO: renamed from: h */
                public C1607j mo5254h() {
/* 3 */             C1702a c1702a = (C1702a) this.f11662b;
/* 5 */             c1702a.m5443c();
/* 8 */             c1702a.close();
/* 11 */            return null;
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: i */
                public Integer mo5034i() {
                    int i;
/* 3 */             Layout layout = (Layout) this.f11662b;
/* 12 */            if (layout.getText() instanceof Spanned) {
/* 15 */                CharSequence text = layout.getText();
/* 19 */                text.getClass();
/* 39 */                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
/* 41 */                foregroundColorSpanArr.getClass();
/* 45 */                int i2 = Integer.MIN_VALUE;
/* 47 */                Integer numValueOf = null;
/* 48 */                for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
/* 52 */                    CharSequence text2 = layout.getText();
/* 56 */                    text2.getClass();
/* 61 */                    int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
/* 65 */                    CharSequence text3 = layout.getText();
/* 69 */                    text3.getClass();
/* 74 */                    int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
/* 79 */                    if (spanStart != -1 && spanEnd != -1 && (i = spanEnd - spanStart) > i2) {
/* 91 */                        numValueOf = Integer.valueOf(foregroundColorSpan.getForegroundColor());
/* 95 */                        i2 = i;
                            }
                        }
/* 99 */                if (numValueOf != null) {
/* 108 */                   return Integer.valueOf(numValueOf.intValue() | (-16777216));
                        }
                    }
/* 11 */            return null;
                }

                @Override // io.sentry.android.replay.util.InterfaceC1358l
                /* JADX INFO: renamed from: j */
                public float mo5035j(int i) {
/* 3 */             Layout layout = (Layout) this.f11662b;
/* 9 */             if (layout.getEllipsizedWidth() <= 0 || layout.getEllipsizedWidth() >= layout.getWidth()) {
/* 23 */                return layout.getLineLeft(i);
                    }
/* 21 */            return 0.0f;
                }

                /* JADX INFO: renamed from: k */
                public void m5407k(AbstractC1275u0 abstractC1275u0) {
/* 5 */             ((C1248o0) this.f11662b).getClass();
/* 8 */             int i = Build.VERSION.SDK_INT;
/* 12 */            if (i < 26 || i > 28) {
/* 47 */                return;
                    }
/* 18 */            String callingPackage = abstractC1275u0.getCallingPackage();
/* 26 */            String packageName = abstractC1275u0.getContext().getPackageName();
/* 30 */            if (callingPackage == null || !callingPackage.equals(packageName)) {
/* 46 */                throw new SecurityException("Provider does not allow for granting of Uri permissions");
                    }
                }

                /* JADX INFO: renamed from: l */
                public C1593c m5408l() {
/* 5 */             if (((C1593c) this.f11662b) == null) {
/* 12 */                this.f11662b = new C1593c();
                    }
/* 16 */            return (C1593c) this.f11662b;
                }

                /* JADX INFO: renamed from: m */
                public ArrayList m5409m(StackTraceElement[] stackTraceElementArr, boolean z) {
/* 1 */             if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
/* 132 */               return null;
                    }
/* 8 */             ArrayList arrayList = new ArrayList();
/* 13 */            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
/* 17 */                if (stackTraceElement != null) {
/* 19 */                    String className = stackTraceElement.getClassName();
/* 23 */                    if (z || !className.startsWith("io.sentry.") || className.startsWith("io.sentry.samples.") || className.startsWith("io.sentry.mobile.")) {
/* 52 */                        C1590a0 c1590a0 = new C1590a0();
/* 57 */                        C1554m6 c1554m6 = (C1554m6) this.f11662b;
/* 71 */                        c1590a0.f11252V = m5404n(className, c1554m6.getInAppIncludes(), c1554m6.getInAppExcludes());
/* 73 */                        c1590a0.f11267f = className;
/* 79 */                        c1590a0.f11265e = stackTraceElement.getMethodName();
/* 85 */                        c1590a0.f11263d = stackTraceElement.getFileName();
/* 91 */                        if (stackTraceElement.getLineNumber() >= 0) {
/* 101 */                           c1590a0.f11270i = Integer.valueOf(stackTraceElement.getLineNumber());
                                }
/* 111 */                       c1590a0.f11254X = Boolean.valueOf(stackTraceElement.isNativeMethod());
/* 113 */                       arrayList.add(c1590a0);
/* 122 */                       if (arrayList.size() >= 100) {
                                    break;
                                }
                            }
                        }
                    }
/* 128 */           Collections.reverse(arrayList);
/* 131 */           return arrayList;
                }

                @Override // io.sentry.featureflags.InterfaceC1453b
/* 18 */        public InterfaceC1453b clone() {
/* 19 */            return new C1666s6(8);
                }

/* 80 */        public C1666s6(C1297c c1297c, InterfaceC1747x5 interfaceC1747x5) {
                    this.f11661a = 3;
/* 82 */            this.f11662b = interfaceC1747x5;
                }

/* 82 */        public /* synthetic */ C1666s6(Object obj, int i) {
/* 83 */            this.f11661a = i;
                    this.f11662b = obj;
                }
            }
