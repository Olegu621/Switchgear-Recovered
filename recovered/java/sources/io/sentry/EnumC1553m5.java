            package io.sentry;

            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            import java.util.Locale;
            
            /* JADX INFO: renamed from: io.sentry.m5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC1553m5 implements InterfaceC1458g2 {
                DEBUG,
                INFO,
                WARNING,
                ERROR,
                FATAL;

                @Override // io.sentry.InterfaceC1458g2
                public void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 13 */            ((C1505c) interfaceC1518j3).m5300y(name().toLowerCase(Locale.ROOT));
                }
            }
