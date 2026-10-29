            package io.sentry;
            
            /* JADX INFO: renamed from: io.sentry.n */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC1560n {
                All("__all__"),
                Default("default"),
                Error("error"),
                Feedback("feedback"),
                Session("session"),
                Attachment("attachment"),
                LogItem("log_item"),
                LogByte("log_byte"),
                TraceMetric("trace_metric"),
                TraceMetricByte("trace_metric_byte"),
                Monitor("monitor"),
                Profile("profile"),
                ProfileChunkUi("profile_chunk_ui"),
                ProfileChunk("profile_chunk"),
                Transaction("transaction"),
                Replay("replay"),
                Span("span"),
                Security("security"),
                UserReport("user_report"),
                Unknown("unknown");

                private final String category;

                EnumC1560n(String str) {
/* 4 */             this.category = str;
                }

                public String getCategory() {
/* 1 */             return this.category;
                }
            }
