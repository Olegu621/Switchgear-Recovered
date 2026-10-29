            package io.sentry;

            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.C1297c;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1609k;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1677c;
            import io.sentry.transport.C1690p;
            import io.sentry.transport.InterfaceC1681g;
            import java.io.PrintStream;
            import java.io.PrintWriter;
            import java.io.StringWriter;
            import java.util.List;
            
            /* JADX INFO: renamed from: io.sentry.l2 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1535l2 implements InterfaceC1561n0, InterfaceC1660s0, InterfaceC1695u0, InterfaceC1725v3, InterfaceC1562n1, InterfaceC1571o1, ILogger {

                /* JADX INFO: renamed from: a */
                public static final C1535l2 f11111a = new C1535l2();

                /* JADX INFO: renamed from: b */
                public static final C1535l2 f11112b = new C1535l2();

                /* JADX INFO: renamed from: c */
                public static final C1535l2 f11113c = new C1535l2();

                /* JADX INFO: renamed from: d */
                public static final C1535l2 f11114d = new C1535l2();

                /* JADX INFO: renamed from: e */
                public static final C1535l2 f11115e = new C1535l2();

                @Override // io.sentry.InterfaceC1695u0
                /* JADX INFO: renamed from: a */
                public C1626w mo5210a(C1609k c1609k) {
/* 1 */             return C1626w.f11478b;
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: b */
                public void mo4670b(EnumC1553m5 enumC1553m5, Throwable th, String str, Object... objArr) {
/* 1 */             PrintStream printStream = System.out;
/* 3 */             String str2 = String.format(str, objArr);
/* 7 */             String string = th.toString();
/* 13 */            StringWriter stringWriter = new StringWriter();
/* 21 */            th.printStackTrace(new PrintWriter(stringWriter));
/* 64 */            printStream.println(enumC1553m5 + ": " + str2 + " \n " + string + "\n" + stringWriter.toString());
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: c */
                public void mo4971c(Boolean bool) {
                }

                @Override // io.sentry.InterfaceC1562n1
                public void close() {
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: d */
                public void mo4671d(EnumC1553m5 enumC1553m5, String str, Throwable th) {
/* 1 */             if (th == null) {
/* 6 */                 mo4672k(enumC1553m5, str, new Object[0]);
/* 9 */                 return;
                    }
/* 10 */            PrintStream printStream = System.out;
/* 20 */            String str2 = String.format(str, th.toString());
/* 26 */            StringWriter stringWriter = new StringWriter();
/* 34 */            th.printStackTrace(new PrintWriter(stringWriter));
/* 69 */            printStream.println(enumC1553m5 + ": " + str2 + "\n" + stringWriter.toString());
                }

                @Override // io.sentry.InterfaceC1562n1
                /* JADX INFO: renamed from: e */
                public void mo4950e(InterfaceC1549m1 interfaceC1549m1) {
                }

                @Override // io.sentry.InterfaceC1562n1
                /* JADX INFO: renamed from: f */
                public C1642r3 mo4951f(C1748x6 c1748x6, List list, C1554m6 c1554m6) {
/* 1 */             return null;
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: g */
                public void mo4972g(C1626w c1626w) {
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: h */
                public void mo4973h(C1297c c1297c) {
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: i */
                public C1626w mo4974i() {
/* 1 */             return C1626w.f11478b;
                }

                @Override // io.sentry.InterfaceC1562n1
                public boolean isRunning() {
/* 1 */             return false;
                }

                @Override // io.sentry.InterfaceC1695u0
                /* JADX INFO: renamed from: j */
                public C1626w mo5213j(C1609k c1609k) {
/* 1 */             return C1626w.f11478b;
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: k */
                public void mo4672k(EnumC1553m5 enumC1553m5, String str, Object... objArr) {
/* 27 */            System.out.println(enumC1553m5 + ": " + String.format(str, objArr));
                }

                @Override // io.sentry.InterfaceC1695u0
                /* JADX INFO: renamed from: l */
                public C1626w mo5214l(C1609k c1609k) {
/* 1 */             return C1626w.f11478b;
                }

                @Override // io.sentry.ILogger
                /* JADX INFO: renamed from: m */
                public boolean mo4673m(EnumC1553m5 enumC1553m5) {
/* 1 */             return true;
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: n */
                public void mo4976n() {
                }

                @Override // io.sentry.InterfaceC1571o1
                /* JADX INFO: renamed from: o */
                public InterfaceC1681g mo5255o(SentryAndroidOptions sentryAndroidOptions, C1505c c1505c) {
/* 12 */            return new C1677c(sentryAndroidOptions, new C1690p(sentryAndroidOptions), sentryAndroidOptions.getTransportGate(), c1505c);
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: p */
                public InterfaceC1698u3 getF10414Z() {
/* 1 */             return C1670t2.f11666a;
                }

                @Override // io.sentry.InterfaceC1725v3
                public void pause() {
                }

                @Override // io.sentry.InterfaceC1725v3
                public void resume() {
                }

                @Override // io.sentry.InterfaceC1562n1
                public void start() {
                }

                @Override // io.sentry.InterfaceC1725v3
                public void stop() {
                }
            }
