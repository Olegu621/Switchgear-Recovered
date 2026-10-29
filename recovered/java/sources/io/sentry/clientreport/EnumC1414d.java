            package io.sentry.clientreport;
            
            /* JADX INFO: renamed from: io.sentry.clientreport.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum EnumC1414d {
                QUEUE_OVERFLOW("queue_overflow"),
                CACHE_OVERFLOW("cache_overflow"),
                RATELIMIT_BACKOFF("ratelimit_backoff"),
                NETWORK_ERROR("network_error"),
                SEND_ERROR("send_error"),
                SAMPLE_RATE("sample_rate"),
                BEFORE_SEND("before_send"),
                EVENT_PROCESSOR("event_processor"),
                BACKPRESSURE("backpressure");

                private final String reason;

                EnumC1414d(String str) {
/* 4 */             this.reason = str;
                }

                public String getReason() {
/* 1 */             return this.reason;
                }
            }
