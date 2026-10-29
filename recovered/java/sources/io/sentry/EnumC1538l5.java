            package io.sentry;

            import androidx.core.app.NotificationCompat;
            import io.sentry.clientreport.C1412b;
            import io.sentry.internal.debugmeta.C1505c;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1609k;
            import java.io.IOException;
            
            /* JADX INFO: renamed from: io.sentry.l5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC1538l5 implements InterfaceC1458g2 {
                Session("session"),
                Event(NotificationCompat.CATEGORY_EVENT),
                UserFeedback("user_report"),
                Attachment("attachment"),
                Transaction("transaction"),
                Profile("profile"),
                ProfileChunk("profile_chunk"),
                ClientReport("client_report"),
                ReplayEvent("replay_event"),
                ReplayRecording("replay_recording"),
                ReplayVideo("replay_video"),
                CheckIn("check_in"),
                Feedback("feedback"),
                Log("log"),
                TraceMetric("trace_metric"),
                Span("span"),
                Unknown("__unknown__");

                private final String itemType;

                EnumC1538l5(String str) {
/* 4 */             this.itemType = str;
                }

                public static EnumC1538l5 resolve(Object obj) {
/* 3 */             if (obj instanceof C1393c5) {
                        return ((C1609k) ((C1393c5) obj).f11517b.m5376w(C1609k.class, "feedback")) == null ? Event : Feedback;
                    }
/* 29 */            if (obj instanceof C1600f0) {
/* 31 */                return Transaction;
                    }
/* 36 */            if (obj instanceof C1764z6) {
/* 38 */                return Session;
                    }
                    return obj instanceof C1412b ? ClientReport : Attachment;
                }

                public static EnumC1538l5 valueOfLabel(String str) {
/* 7 */             for (EnumC1538l5 enumC1538l5 : values()) {
/* 17 */                if (enumC1538l5.itemType.equals(str)) {
/* 19 */                    return enumC1538l5;
                        }
                    }
/* 23 */            return Unknown;
                }

                public String getItemType() {
/* 1 */             return this.itemType;
                }

                @Override // io.sentry.InterfaceC1458g2
                public void serialize(InterfaceC1518j3 interfaceC1518j3, ILogger iLogger) throws IOException {
/* 5 */             ((C1505c) interfaceC1518j3).m5300y(this.itemType);
                }
            }
