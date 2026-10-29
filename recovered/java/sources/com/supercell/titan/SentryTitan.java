            package com.supercell.titan;

            import io.sentry.AbstractC1552m4;
            import io.sentry.C1154a;
            import io.sentry.C1393c5;
            import io.sentry.C1486i0;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.protocol.C1616p;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Objects;
            import java.util.Random;
            import p000.AbstractC0886en;
            import p000.C2076pn;
            import p000.fm0;
            import p000.p92;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SentryTitan {

                /* JADX INFO: renamed from: a */
                public static final Random f5920a = new Random();

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface EventAttachment {
                    C1154a toSentryAttachment();
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class EventBytesAttachment extends fm0 implements EventAttachment {

                    /* JADX INFO: renamed from: a */
                    public final String f5921a;

                    /* JADX INFO: renamed from: b */
                    public final byte[] f5922b;

                    public EventBytesAttachment(String str, byte[] bArr) {
/* 4 */                 this.f5921a = str;
/* 6 */                 this.f5922b = bArr;
                    }

                    public byte[] bytes() {
/* 1 */                 return this.f5922b;
                    }

                    public final boolean equals(Object obj) {
/* 3 */                 if (!(obj instanceof EventBytesAttachment)) {
/* 29 */                    return false;
                        }
/* 5 */                 EventBytesAttachment eventBytesAttachment = (EventBytesAttachment) obj;
                        return Objects.equals(this.f5921a, eventBytesAttachment.f5921a) && Objects.equals(this.f5922b, eventBytesAttachment.f5922b);
                    }

                    public String filename() {
/* 1 */                 return this.f5921a;
                    }

                    public final int hashCode() {
/* 15 */                return Objects.hashCode(this.f5922b) + (Objects.hashCode(this.f5921a) * 31);
                    }

                    @Override // com.supercell.titan.SentryTitan.EventAttachment
                    public C1154a toSentryAttachment() {
/* 8 */                 return new C1154a(this.f5922b, this.f5921a, null);
                    }

                    public final String toString() {
/* 2 */                 Object[] objArr = {this.f5921a, this.f5922b};
/* 27 */                String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
/* 33 */                StringBuilder sb = new StringBuilder();
/* 42 */                sb.append(EventBytesAttachment.class.getSimpleName());
/* 47 */                sb.append("[");
/* 51 */                for (int i = 0; i < strArrSplit.length; i++) {
/* 55 */                    sb.append(strArrSplit[i]);
/* 60 */                    sb.append("=");
/* 65 */                    sb.append(objArr[i]);
/* 70 */                    if (i != strArrSplit.length - 1) {
/* 74 */                        sb.append(", ");
                            }
                        }
/* 82 */                sb.append("]");
/* 85 */                return sb.toString();
                    }
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static final class EventFileAttachment extends fm0 implements EventAttachment {

                    /* JADX INFO: renamed from: a */
                    public final String f5923a;

                    public EventFileAttachment(String str) {
/* 4 */                 this.f5923a = str;
                    }

                    public final boolean equals(Object obj) {
                        return (obj instanceof EventFileAttachment) && Objects.equals(this.f5923a, ((EventFileAttachment) obj).f5923a);
                    }

                    public final int hashCode() {
/* 3 */                 return Objects.hashCode(this.f5923a);
                    }

                    public String path() {
/* 1 */                 return this.f5923a;
                    }

                    @Override // com.supercell.titan.SentryTitan.EventAttachment
                    public C1154a toSentryAttachment() {
/* 5 */                 return new C1154a(this.f5923a);
                    }

                    public final String toString() {
/* 2 */                 Object[] objArr = {this.f5923a};
/* 22 */                String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
/* 28 */                StringBuilder sb = new StringBuilder();
/* 37 */                sb.append(EventFileAttachment.class.getSimpleName());
/* 42 */                sb.append("[");
/* 46 */                for (int i = 0; i < strArrSplit.length; i++) {
/* 50 */                    sb.append(strArrSplit[i]);
/* 55 */                    sb.append("=");
/* 60 */                    sb.append(objArr[i]);
/* 65 */                    if (i != strArrSplit.length - 1) {
/* 69 */                        sb.append(", ");
                            }
                        }
/* 77 */                sb.append("]");
/* 80 */                return sb.toString();
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m2745a(Exception exc) {
/* 1 */             InterfaceC1389c1 interfaceC1389c1M5357b = AbstractC1552m4.m5357b();
/* 5 */             interfaceC1389c1M5357b.getClass();
/* 13 */            interfaceC1389c1M5357b.mo5104x(exc, new C1486i0());
                }

                public static void addEvent(String str, p92 p92Var, Exception exc, EventAttachment[] eventAttachmentArr, String str2) {
/* 9 */             C1393c5 c1393c5 = exc != null ? new C1393c5(exc) : new C1393c5();
/* 12 */            if (str != null && !str.isEmpty()) {
/* 22 */                C1616p c1616p = new C1616p();
/* 25 */                c1616p.f11421b = str;
/* 27 */                c1393c5.f10783b0 = c1616p;
                    }
/* 31 */            c1393c5.f10787f0 = p92Var.f15033a;
/* 33 */            if (str2 != null && !str2.isEmpty()) {
/* 48 */                ArrayList arrayList = new ArrayList(1);
/* 52 */                Object obj = new Object[]{str2}[0];
/* 54 */                Objects.requireNonNull(obj);
/* 57 */                arrayList.add(obj);
/* 64 */                c1393c5.m5111h(Collections.unmodifiableList(arrayList));
                    }
/* 74 */            AbstractC1552m4.m5363h(new C2076pn(14, eventAttachmentArr, c1393c5));
                }

                /* JADX INFO: renamed from: b */
                public static void m2746b(String str) {
/* 3 */             String strM3507k = AbstractC0886en.m3507k("WARNING: ", str);
/* 7 */             p92 p92Var = p92.WARNING;
/* 11 */            C1393c5 c1393c5 = new C1393c5();
/* 16 */            C1616p c1616p = new C1616p();
/* 19 */            c1616p.f11420a = strM3507k;
/* 21 */            c1616p.f11421b = strM3507k;
/* 23 */            c1393c5.f10783b0 = c1616p;
/* 27 */            c1393c5.f10787f0 = p92Var.f15033a;
/* 32 */            ArrayList arrayList = new ArrayList(1);
/* 35 */            arrayList.add(strM3507k);
/* 38 */            c1393c5.m5111h(arrayList);
/* 41 */            InterfaceC1389c1 interfaceC1389c1M5357b = AbstractC1552m4.m5357b();
/* 45 */            interfaceC1389c1M5357b.getClass();
/* 53 */            interfaceC1389c1M5357b.mo5080B(c1393c5, new C1486i0());
                }
            }
