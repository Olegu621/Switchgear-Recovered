            package io.sentry.android.replay;

            import p000.ds0;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.r */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1333r {

                /* JADX INFO: renamed from: a */
                public volatile EnumC1334s f10572a;

                /* JADX INFO: renamed from: a */
                public final boolean m5018a(EnumC1334s enumC1334s) {
/* 1 */             enumC1334s.getClass();
                    switch (AbstractC1332q.f10571a[this.f10572a.ordinal()]) {
                        case 1:
                            return enumC1334s == EnumC1334s.STARTED || enumC1334s == EnumC1334s.CLOSED;
                        case 2:
                            return enumC1334s == EnumC1334s.PAUSED || enumC1334s == EnumC1334s.STOPPED || enumC1334s == EnumC1334s.CLOSED;
                        case 3:
                            return enumC1334s == EnumC1334s.PAUSED || enumC1334s == EnumC1334s.STOPPED || enumC1334s == EnumC1334s.CLOSED;
                        case 4:
                            return enumC1334s == EnumC1334s.RESUMED || enumC1334s == EnumC1334s.STOPPED || enumC1334s == EnumC1334s.CLOSED;
                        case 5:
                            return enumC1334s == EnumC1334s.STARTED || enumC1334s == EnumC1334s.CLOSED;
                        case 6:
/* 15 */                    return false;
                        default:
/* 19 */                    ds0.m3187b();
/* 22 */                    return false;
                    }
                }
            }
