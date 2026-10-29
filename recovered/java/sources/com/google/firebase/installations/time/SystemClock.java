            package com.google.firebase.installations.time;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SystemClock implements Clock {
                private static SystemClock singleton;

                private SystemClock() {
                }

                public static SystemClock getInstance() {
/* 3 */             if (singleton == null) {
/* 10 */                singleton = new SystemClock();
                    }
/* 12 */            return singleton;
                }

                @Override // com.google.firebase.installations.time.Clock
                public long currentTimeMillis() {
/* 1 */             return System.currentTimeMillis();
                }
            }
