            package kotlin.text;

            import java.io.InvalidObjectException;
            import java.io.ObjectInputStream;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            import kotlin.Metadata;
            import kotlin.collections.C1839a;
            import okhttp3.HttpUrl;
            import p000.l22;
            import p000.n22;
            import p000.ra2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            @Metadata(m6175d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0002\u0014\u0015B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m6176d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", HttpUrl.FRAGMENT_ENCODE_SET, "pattern", "<init>", "(Ljava/lang/String;)V", HttpUrl.FRAGMENT_ENCODE_SET, "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "input", HttpUrl.FRAGMENT_ENCODE_SET, "readObject", "(Ljava/io/ObjectInputStream;)V", HttpUrl.FRAGMENT_ENCODE_SET, "replacement", "replace", "(Ljava/lang/CharSequence;Ljava/lang/String;)Ljava/lang/String;", "b", "n22", "l22", "kotlin-stdlib"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
/* 13 */    public final class Regex implements Serializable {

                /* JADX INFO: renamed from: b */
                public static final l22 f12937b = new l22(null);

                /* JADX INFO: renamed from: a */
                public final Pattern f12938a;

                /* JADX WARN: Illegal instructions before constructor call */
                public Regex(String str) {
/* 1 */             str.getClass();
/* 4 */             Pattern patternCompile = Pattern.compile(str);
/* 8 */             patternCompile.getClass();
/* 11 */            this(patternCompile);
                }

                private final void readObject(ObjectInputStream input) throws InvalidObjectException {
/* 8 */             throw new InvalidObjectException("Deserialization is supported via proxy only");
                }

                private final Object writeReplace() {
/* 3 */             Pattern pattern = this.f12938a;
/* 5 */             String strPattern = pattern.pattern();
/* 9 */             strPattern.getClass();
/* 16 */            return new n22(strPattern, pattern.flags());
                }

                /* JADX INFO: renamed from: a */
                public final ra2 m6222a(String str) {
/* 1 */             str.getClass();
/* 6 */             Matcher matcher = this.f12938a.matcher(str);
/* 10 */            matcher.getClass();
/* 17 */            if (matcher.matches()) {
/* 23 */                return new ra2(matcher, str);
                    }
/* 19 */            return null;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m6223b(String str) {
/* 1 */             str.getClass();
/* 10 */            return this.f12938a.matcher(str).matches();
                }

                /* JADX INFO: renamed from: c */
                public final List m6224c(String str) {
/* 1 */             str.getClass();
/* 4 */             int iEnd = 0;
/* 5 */             StringsKt__StringsKt.m6248t(0);
/* 10 */            Matcher matcher = this.f12938a.matcher(str);
/* 18 */            if (!matcher.find()) {
/* 24 */                return C1839a.m6210b(str.toString());
                    }
/* 33 */            ArrayList arrayList = new ArrayList(10);
/* 59 */            do {
/* 48 */                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
/* 51 */                iEnd = matcher.end();
/* 59 */            } while (matcher.find());
/* 73 */            arrayList.add(str.subSequence(iEnd, str.length()).toString());
/* 76 */            return arrayList;
                }

                public final String replace(CharSequence input, String replacement) {
/* 1 */             input.getClass();
/* 4 */             replacement.getClass();
/* 13 */            String strReplaceAll = this.f12938a.matcher(input).replaceAll(replacement);
/* 17 */            strReplaceAll.getClass();
/* 20 */            return strReplaceAll;
                }

                public final String toString() {
/* 3 */             String string = this.f12938a.toString();
/* 7 */             string.getClass();
/* 10 */            return string;
                }

/* 14 */        public Regex(Pattern pattern) {
                    pattern.getClass();
/* 16 */            this.f12938a = pattern;
                }
            }
