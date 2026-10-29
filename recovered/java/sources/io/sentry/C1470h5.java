            package io.sentry;

            import p000.AbstractC0886en;
            
            /* JADX INFO: renamed from: io.sentry.h5 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1470h5 {

                /* JADX INFO: renamed from: a */
                public boolean f10977a;

                /* JADX INFO: renamed from: b */
                public boolean f10978b;

                /* JADX INFO: renamed from: c */
                public boolean f10979c;

                /* JADX INFO: renamed from: d */
                public boolean f10980d;

                /* JADX INFO: renamed from: e */
                public boolean f10981e;

                /* JADX INFO: renamed from: f */
                public boolean f10982f;

                /* JADX INFO: renamed from: g */
                public boolean f10983g;

                /* JADX INFO: renamed from: h */
                public Runnable f10984h;

                /* JADX INFO: renamed from: a */
                public final boolean m5258a() {
/* 1 */             return this.f10979c;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m5259b() {
/* 1 */             return this.f10977a;
                }

                /* JADX INFO: renamed from: c */
                public final boolean m5260c() {
/* 1 */             return this.f10982f;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m5261d() {
/* 1 */             return this.f10980d;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m5262e() {
/* 1 */             return this.f10978b;
                }

                /* JADX INFO: renamed from: f */
                public final boolean m5263f() {
/* 1 */             return this.f10981e;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m5264g() {
/* 1 */             return this.f10983g;
                }

                /* JADX INFO: renamed from: h */
                public final void m5265h(boolean z) {
/* 1 */             this.f10979c = z;
                }

                /* JADX INFO: renamed from: i */
                public final void m5266i(boolean z) {
/* 1 */             this.f10977a = z;
                }

                /* JADX INFO: renamed from: j */
                public final void m5267j(boolean z) {
/* 1 */             this.f10982f = z;
                }

                /* JADX INFO: renamed from: k */
                public final void m5268k(boolean z) {
/* 1 */             this.f10980d = z;
                }

                /* JADX INFO: renamed from: l */
                public final void m5269l(boolean z) {
/* 1 */             this.f10978b = z;
                }

                /* JADX INFO: renamed from: m */
                public final void m5270m(boolean z) {
/* 1 */             this.f10981e = z;
                }

                /* JADX INFO: renamed from: n */
                public final void m5271n(boolean z) {
/* 1 */             this.f10983g = z;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("SentryFeedbackOptions{isNameRequired=");
/* 10 */            sb.append(this.f10977a);
/* 15 */            sb.append(", showName=");
/* 20 */            sb.append(this.f10978b);
/* 25 */            sb.append(", isEmailRequired=");
/* 30 */            sb.append(this.f10979c);
/* 35 */            sb.append(", showEmail=");
/* 40 */            sb.append(this.f10980d);
/* 45 */            sb.append(", useSentryUser=");
/* 50 */            sb.append(this.f10981e);
/* 55 */            sb.append(", showBranding=");
/* 60 */            sb.append(this.f10982f);
/* 65 */            sb.append(", useShakeGesture=");
/* 72 */            return AbstractC0886en.m3511o(sb, this.f10983g, ", formTitle='Report a Bug', submitButtonLabel='Send Bug Report', cancelButtonLabel='Cancel', nameLabel='Name', namePlaceholder='Your Name', emailLabel='Email', emailPlaceholder='your.email@example.org', isRequiredLabel=' (Required)', messageLabel='Description', messagePlaceholder='What's the bug? What did you expect?'}");
                }
            }
