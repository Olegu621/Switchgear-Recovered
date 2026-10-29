            package io.sentry.rrweb;

            import io.sentry.ILogger;
            import io.sentry.InterfaceC1458g2;
            import io.sentry.InterfaceC1518j3;
            import io.sentry.internal.debugmeta.C1505c;
            import java.io.IOException;
            
            /* JADX INFO: renamed from: io.sentry.rrweb.f */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public enum EnumC1651f implements InterfaceC1458g2 {
                MouseUp,
                MouseDown,
                Click,
                ContextMenu,
                DblClick,
                Focus,
                Blur,
                TouchStart,
                TouchMove_Departed,
                TouchEnd,
                TouchCancel;

                @Override // io.sentry.InterfaceC1458g2
                public void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 8 */             ((C1505c) interfaceC1518j3).m5296u(ordinal());
                }
            }
