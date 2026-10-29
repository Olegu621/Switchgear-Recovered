            package com.google.firebase.installations;

            import p000.kb1;
            import p000.wi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public class FirebaseInstallationsException extends wi0 {
                private final Status status;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum Status {
                    BAD_CONFIG,
                    UNAVAILABLE,
                    TOO_MANY_REQUESTS
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public FirebaseInstallationsException(String str, Status status) {
/* 6 */             super(str);
/* 3 */             kb1.m6059l(str, "Detail message must not be empty");
/* 9 */             this.status = status;
                }

                public Status getStatus() {
/* 1 */             return this.status;
                }

/* 11 */        public FirebaseInstallationsException(Status status) {
/* 13 */            this.status = status;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public FirebaseInstallationsException(String str, Status status, Throwable th) {
                    super(str, th);
/* 14 */            kb1.m6059l(str, "Detail message must not be empty");
/* 15 */            this.status = status;
                }
            }
