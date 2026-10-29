            package io.sentry;

            import io.sentry.protocol.C1610k0;
            import java.io.File;
            import p000.bh0;
            
            /* JADX INFO: renamed from: io.sentry.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 27 */    public final class C1154a {

                /* JADX INFO: renamed from: a */
                public final byte[] f9787a;

                /* JADX INFO: renamed from: b */
                public final C1610k0 f9788b;

                /* JADX INFO: renamed from: c */
                public final bh0 f9789c;

                /* JADX INFO: renamed from: d */
                public final String f9790d;

                /* JADX INFO: renamed from: e */
                public final String f9791e;

                /* JADX INFO: renamed from: f */
                public final String f9792f;

                /* JADX INFO: renamed from: g */
                public final String f9793g;

                public C1154a(String str) {
/* 6 */             String name = new File(str).getName();
/* 13 */            this.f9790d = str;
/* 15 */            this.f9791e = name;
/* 18 */            this.f9788b = null;
/* 20 */            this.f9789c = null;
/* 22 */            this.f9792f = null;
/* 26 */            this.f9793g = "event.attachment";
                }

/* 28 */        public C1154a(String str, String str2, String str3, byte[] bArr) {
/* 30 */            this.f9787a = bArr;
/* 31 */            this.f9788b = null;
/* 32 */            this.f9789c = null;
/* 33 */            this.f9791e = str;
/* 34 */            this.f9792f = str2;
/* 35 */            this.f9793g = str3;
                }

/* 35 */        public C1154a(C1610k0 c1610k0) {
/* 37 */            this.f9787a = null;
/* 38 */            this.f9788b = c1610k0;
/* 39 */            this.f9789c = null;
/* 40 */            this.f9791e = "view-hierarchy.json";
/* 41 */            this.f9792f = "application/json";
/* 42 */            this.f9793g = "event.view_hierarchy";
                }

/* 42 */        public C1154a(bh0 bh0Var) {
/* 44 */            this.f9787a = null;
/* 45 */            this.f9788b = null;
/* 46 */            this.f9789c = bh0Var;
/* 47 */            this.f9791e = "screenshot.png";
/* 48 */            this.f9792f = "image/png";
/* 49 */            this.f9793g = "event.attachment";
                }

/* 49 */        public C1154a(byte[] bArr, String str, String str2) {
/* 50 */            this(str, str2, "event.attachment", bArr);
                }
            }
