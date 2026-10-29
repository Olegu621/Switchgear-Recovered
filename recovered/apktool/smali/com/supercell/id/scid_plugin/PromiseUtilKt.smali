.class public final Lcom/supercell/id/scid_plugin/PromiseUtilKt;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000|\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001aK\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001aO\u0010\n\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\n\u0010\u0007\u001aE\u0010\u000c\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001ae\u0010\u000e\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0016\u0010\n\u001a\u0012\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0004\u0012\u00020\u00040\u00032\u0010\u0008\u0002\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001aK\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0007\u001aO\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0007\u001aE\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b\u00a2\u0006\u0004\u0008\u0012\u0010\r\u001aQ\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0007\u001aa\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u00020\u0003\u00a2\u0006\u0004\u0008\u0015\u0010\u0007\u001aQ\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0007\u001aa\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0013*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\"\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u00020\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0007\u001ae\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0018\"\u0004\u0008\u0001\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u00022\u0008\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0004\u0012\u00020\u00040\u001b\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001aa\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0018\"\u0004\u0008\u0001\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u00022\u0008\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001d\u001a\u009f\u0001\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002\"\u0004\u0008\u0000\u0010\u0018\"\u0004\u0008\u0001\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u00022\u0008\u0010\u001a\u001a\u0004\u0018\u00018\u00002\u001c\u0008\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2 \u0008\u0002\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001b2\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 \u001aO\u0010\"\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010!\u001a\u0012\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0004\u0012\u00028\u00000\u0003\u00a2\u0006\u0004\u0008\"\u0010\u0007\u001aS\u0010#\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u001a\u0010!\u001a\u0016\u0012\u0008\u0012\u00060\u0008j\u0002`\t\u0012\u0008\u0012\u00060\u0008j\u0002`\t0\u0003\u00a2\u0006\u0004\u0008#\u0010\u0007\u001aC\u0010&\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001j\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0006\u0010%\u001a\u00020$\u00a2\u0006\u0004\u0008&\u0010\'\u001aO\u0010*\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0008\u0012\u00060(j\u0002`)\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\u0008*\u0010\u0007\u001a2\u0010.\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000+j\u0008\u0012\u0004\u0012\u00028\u0000`,2\u0006\u0010-\u001a\u00028\u0000H\u0086\u0008\u00a2\u0006\u0004\u0008.\u0010/\u001a6\u00101\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0019*\u0012\u0012\u0004\u0012\u00028\u00000+j\u0008\u0012\u0004\u0012\u00028\u0000`,2\n\u00100\u001a\u00060\u0008j\u0002`\tH\u0086\u0008\u00a2\u0006\u0004\u00081\u00102\u001a.\u00103\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u00002\u0006\u0010-\u001a\u00028\u0000H\u0086\u0008\u00a2\u0006\u0004\u00083\u00104\u001a2\u00106\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u00002\n\u00105\u001a\u00060\u0008j\u0002`\tH\u0086\u0008\u00a2\u0006\u0004\u00086\u00107\u001a&\u00108\u001a\u0012\u0012\u0004\u0012\u00028\u00000+j\u0008\u0012\u0004\u0012\u00028\u0000`,\"\u0004\u0008\u0000\u0010\u0000H\u0086\u0008\u00a2\u0006\u0004\u00088\u00109\u001af\u0010=\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000<0\u0001j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000<`\u0002\"\u0004\u0008\u0000\u0010\u000022\u0010;\u001a\u001a\u0012\u0016\u0008\u0001\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00020:\"\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002H\u0086\u0008\u00a2\u0006\u0004\u0008=\u0010>\u001aP\u0010=\u001a\u001e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000<0\u0001j\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00000<`\u0002\"\u0004\u0008\u0000\u0010\u00002\u001c\u0010;\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00020?H\u0086\u0008\u00a2\u0006\u0004\u0008=\u0010@\u001at\u0010F\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E0\u0001j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010E`\u0002\"\u0004\u0008\u0000\u0010A\"\u0004\u0008\u0001\u0010B2\u0016\u0010C\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00022\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0001j\u0008\u0012\u0004\u0012\u00028\u0001`\u0002H\u0086\u0008\u00a2\u0006\u0004\u0008F\u0010G\u001a1\u0010H\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000b\u00a2\u0006\u0004\u0008H\u0010I\u001a%\u0010K\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0001j\u0008\u0012\u0004\u0012\u00020\u0004`\u00022\u0006\u0010J\u001a\u00020$\u00a2\u0006\u0004\u0008K\u0010L\u001a{\u0010S\u001a\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u0002\"\u0004\u0008\u0000\u0010\u00002.\u0010M\u001a*\u0012\u000c\u0012\n\u0018\u00010\u0008j\u0004\u0018\u0001`\t\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00020\u00032\u0008\u0008\u0002\u0010O\u001a\u00020N2\u0008\u0008\u0002\u0010P\u001a\u00020$2\u0008\u0008\u0002\u0010Q\u001a\u00020$2\u0008\u0008\u0002\u0010R\u001a\u00020$\u00a2\u0006\u0004\u0008S\u0010T\"-\u0010-\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u0000*\u0012\u0012\u0004\u0012\u00028\u00000\u0001j\u0008\u0012\u0004\u0012\u00028\u0000`\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008U\u0010V*\u001c\u0010W\u001a\u0004\u0008\u0000\u0010\u0000\"\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0008\u0012\u0004\u0012\u00028\u00000\u0001*\u001c\u0010X\u001a\u0004\u0008\u0000\u0010\u0000\"\u0008\u0012\u0004\u0012\u00028\u00000+2\u0008\u0012\u0004\u0012\u00028\u00000+*\u000e\u0010Z\"\u0002`Y2\u00060(j\u0002`Y\u00a8\u0006["
    }
    d2 = {
        "T",
        "Le70;",
        "Lcom/supercell/id/scid_plugin/Promise;",
        "Lkotlin/Function1;",
        "",
        "block",
        "success",
        "(Le70;Lkotlin/jvm/functions/Function1;)Le70;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "fail",
        "Lkotlin/Function0;",
        "always",
        "(Le70;Lkotlin/jvm/functions/Function0;)Le70;",
        "subscribe",
        "(Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V",
        "successUi",
        "failUi",
        "alwaysUi",
        "R",
        "thenUi",
        "thenAsyncUi",
        "then",
        "thenAsync",
        "C",
        "V",
        "context",
        "Lkotlin/Function2;",
        "failUiWith",
        "(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Le70;",
        "successUiWith",
        "subscribeUiWith",
        "(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Le70;",
        "transform",
        "mapFail",
        "thenFail",
        "",
        "timeoutMillis",
        "nullAfter",
        "(Le70;J)Le70;",
        "Ljava/util/concurrent/CancellationException;",
        "Lcom/supercell/id/scid_plugin/CancelException;",
        "onCancel",
        "Ljx;",
        "Lcom/supercell/id/scid_plugin/DeferredPromise;",
        "value",
        "resolve",
        "(Ljx;Ljava/lang/Object;)V",
        "exception",
        "reject",
        "(Ljx;Ljava/lang/Exception;)V",
        "ofSuccess",
        "(Ljava/lang/Object;)Le70;",
        "e",
        "ofFail",
        "(Ljava/lang/Exception;)Le70;",
        "deferred",
        "()Ljx;",
        "",
        "promises",
        "",
        "all",
        "([Le70;)Le70;",
        "",
        "(Ljava/util/Collection;)Le70;",
        "T1",
        "T2",
        "promise1",
        "promise2",
        "Lkotlin/Pair;",
        "both",
        "(Le70;Le70;)Le70;",
        "task",
        "(Lkotlin/jvm/functions/Function0;)Le70;",
        "millis",
        "ofDelay",
        "(J)Le70;",
        "attempt",
        "",
        "maxRetries",
        "initialRetryDelayMillis",
        "randomRetryDelayMillis",
        "maxRetryDelayMillis",
        "withRetries",
        "(Lkotlin/jvm/functions/Function1;IJJJ)Le70;",
        "getValue",
        "(Le70;)Ljava/lang/Object;",
        "Promise",
        "DeferredPromise",
        "Lkotlinx/coroutines/CancellationException;",
        "CancelException",
        "scid_plugin_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->onCancel$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final all(Ljava/util/Collection;)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "Le70;",
            ">;)",
            "Le70;"
        }
    .end annotation

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    new-instance v0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$2;-><init>(Ljava/util/Collection;Lc10;)V

    const/4 p0, 0x3

    sget-object v2, Ljr0;->a:Ljr0;

    invoke-static {v2, v1, v0, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    move-result-object p0

    return-object p0
.end method

.method public static final varargs all([Le70;)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "Le70;",
            ")",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$all$1;-><init>([Le70;Lc10;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x3

    .line 11
    sget-object v2, Ljr0;->a:Ljr0;

    .line 12
    .line 13
    invoke-static {v2, v1, v0, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public static final always(Le70;Lkotlin/jvm/functions/Function0;)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Liy1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, p0, p1, v2, v1}, Liy1;-><init>(Le70;Lkotlin/jvm/functions/Function0;Lc10;I)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    sget-object v1, Ljr0;->a:Ljr0;

    .line 16
    .line 17
    invoke-static {v1, v2, v0, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static final alwaysUi(Le70;Lkotlin/jvm/functions/Function0;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->a:Lm60;

    .line 8
    .line 9
    sget-object v0, Lgb1;->a:Lkt0;

    .line 10
    .line 11
    new-instance v1, Liy1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v1, p0, p1, v2, v3}, Liy1;-><init>(Le70;Lkotlin/jvm/functions/Function0;Lc10;I)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    sget-object v2, Ljr0;->a:Ljr0;

    .line 20
    .line 21
    invoke-static {v2, v0, v1, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static synthetic b(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Ljava/lang/Exception;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->failUiWith$lambda$1(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Ljava/lang/Exception;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final both(Le70;Le70;)Le70;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T1:",
            "Ljava/lang/Object;",
            "T2:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Le70;",
            ")",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    invoke-direct {v0, p0, p1, v1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt$both$1;-><init>(Le70;Le70;Lc10;)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x3

    .line 14
    sget-object p1, Ljr0;->a:Ljr0;

    .line 15
    .line 16
    invoke-static {p1, v1, v0, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static synthetic c(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->successUiWith$lambda$3(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)Lkotlin/Unit;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final deferred()Ljx;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Ljx;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkx;

    .line 2
    .line 3
    invoke-direct {v0}, Lkx;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static final fail(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljy1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2, p0, p1}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    sget-object v1, Ljr0;->a:Ljr0;

    .line 16
    .line 17
    invoke-static {v1, v2, v0, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static final failUi(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->a:Lm60;

    .line 8
    .line 9
    sget-object v0, Lgb1;->a:Lkt0;

    .line 10
    .line 11
    new-instance v1, Ljy1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v1, v3, v2, p0, p1}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    sget-object v2, Ljr0;->a:Ljr0;

    .line 20
    .line 21
    invoke-static {v2, v0, v1, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static final failUiWith(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Le70;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "TC;",
            "Lkotlin/jvm/functions/Function2<",
            "-TC;-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lhy1;

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    invoke-direct {p1, v0, p2, v1}, Lhy1;-><init>(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->failUi(Le70;Lkotlin/jvm/functions/Function1;)Le70;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final failUiWith$lambda$1(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Ljava/lang/Exception;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0
.end method

.method public static final getValue(Le70;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            ")TT;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Lh01;->isCompleted()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lky1;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-direct {v0, p0, v1, v2}, Lky1;-><init>(Ljava/lang/Object;Lc10;I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Li13;->A(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :cond_0
    return-object v1
.end method

.method public static final mapFail(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "+TV;>;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->b:Ljx2;

    .line 8
    .line 9
    new-instance v1, Ljy1;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, v2, v3, p0, p1}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Ljr0;->a:Ljr0;

    .line 17
    .line 18
    invoke-static {p0, v0, v1, v2}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final nullAfter(Le70;J)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "J)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lz80;->b:Ljx2;

    .line 5
    .line 6
    new-instance v1, Lly1;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v1, p1, p2, p0, v2}, Lly1;-><init>(JLe70;Lc10;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x2

    .line 13
    sget-object p1, Ljr0;->a:Ljr0;

    .line 14
    .line 15
    invoke-static {p1, v0, v1, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final ofDelay(J)Le70;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Le70;"
        }
    .end annotation

    .line 1
    new-instance v0, Lmy1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lmy1;-><init>(JLc10;)V

    .line 5
    .line 6
    .line 7
    const/4 p0, 0x3

    .line 8
    sget-object p1, Ljr0;->a:Ljr0;

    .line 9
    .line 10
    invoke-static {p1, v1, v0, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static final ofFail(Ljava/lang/Exception;)Le70;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            ")",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lkx;

    .line 5
    .line 6
    invoke-direct {v0}, Lkx;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Lkx;->U(Ljava/lang/Throwable;)Z

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public static final ofSuccess(Ljava/lang/Object;)Le70;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "Le70;"
        }
    .end annotation

    .line 1
    new-instance v0, Lkx;

    .line 2
    .line 3
    invoke-direct {v0}, Lkx;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Lz01;->D(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static final onCancel(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/util/concurrent/CancellationException;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lf;

    .line 8
    .line 9
    const/4 v1, 0x3

    .line 10
    invoke-direct {v0, p1, v1}, Lf;-><init>(Ljava/lang/Object;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->fail(Le70;Lkotlin/jvm/functions/Function1;)Le70;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method private static final onCancel$lambda$4(Lkotlin/jvm/functions/Function1;Ljava/lang/Exception;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0
.end method

.method public static final reject(Ljx;Ljava/lang/Exception;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljx;",
            "Ljava/lang/Exception;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    check-cast p0, Lkx;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lkx;->U(Ljava/lang/Throwable;)Z

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public static final resolve(Ljx;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Ljx;",
            "TV;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Lkx;

    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lz01;->D(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final subscribe(Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v0, Lg40;

    .line 11
    .line 12
    const/4 v5, 0x0

    .line 13
    move-object v2, p0

    .line 14
    move-object v1, p1

    .line 15
    move-object v3, p2

    .line 16
    move-object v4, p3

    .line 17
    invoke-direct/range {v0 .. v5}, Lg40;-><init>(Lkotlin/jvm/functions/Function1;Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lc10;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x3

    .line 21
    sget-object p1, Ljr0;->a:Ljr0;

    .line 22
    .line 23
    const/4 p2, 0x0

    .line 24
    invoke-static {p1, p2, v0, p0}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public static synthetic subscribe$default(Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->subscribe(Le70;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final subscribeUiWith(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "TC;",
            "Lkotlin/jvm/functions/Function2<",
            "-TC;-TV;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function2<",
            "-TC;-",
            "Ljava/lang/Exception;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-TC;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 5
    .line 6
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    sget-object p1, Lz80;->a:Lm60;

    .line 10
    .line 11
    sget-object p1, Lgb1;->a:Lkt0;

    .line 12
    .line 13
    new-instance v0, Lg40;

    .line 14
    .line 15
    const/4 v6, 0x0

    .line 16
    move-object v1, p0

    .line 17
    move-object v3, p2

    .line 18
    move-object v4, p3

    .line 19
    move-object v5, p4

    .line 20
    invoke-direct/range {v0 .. v6}, Lg40;-><init>(Le70;Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lc10;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x2

    .line 24
    sget-object p2, Ljr0;->a:Ljr0;

    .line 25
    .line 26
    invoke-static {p2, p1, v0, p0}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 27
    .line 28
    .line 29
    return-object v1
.end method

.method public static synthetic subscribeUiWith$default(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Le70;
    .locals 1

    .line 1
    and-int/lit8 p6, p5, 0x2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p6, :cond_0

    .line 5
    .line 6
    move-object p2, v0

    .line 7
    :cond_0
    and-int/lit8 p6, p5, 0x4

    .line 8
    .line 9
    if-eqz p6, :cond_1

    .line 10
    .line 11
    move-object p3, v0

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move-object p4, v0

    .line 17
    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->subscribeUiWith(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Le70;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method

.method public static final success(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Lny1;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2, p0, p1}, Lny1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x3

    .line 15
    sget-object v1, Ljr0;->a:Ljr0;

    .line 16
    .line 17
    invoke-static {v1, v2, v0, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 18
    .line 19
    .line 20
    return-object p0
.end method

.method public static final successUi(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->a:Lm60;

    .line 8
    .line 9
    sget-object v0, Lgb1;->a:Lkt0;

    .line 10
    .line 11
    new-instance v1, Lny1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x1

    .line 15
    invoke-direct {v1, v3, v2, p0, p1}, Lny1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x2

    .line 19
    sget-object v2, Ljr0;->a:Ljr0;

    .line 20
    .line 21
    invoke-static {v2, v0, v1, p1}, Li13;->w(Ly10;Lkt0;Lkotlin/jvm/functions/Function2;I)Lig2;

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public static final successUiWith(Le70;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Le70;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<C:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "TC;",
            "Lkotlin/jvm/functions/Function2<",
            "-TC;-TV;",
            "Lkotlin/Unit;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance p1, Lhy1;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {p1, v0, p2, v1}, Lhy1;-><init>(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;I)V

    .line 16
    .line 17
    .line 18
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->successUi(Le70;Lkotlin/jvm/functions/Function1;)Le70;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method private static final successUiWith$lambda$3(Ljava/lang/ref/WeakReference;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p0, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 11
    .line 12
    return-object p0
.end method

.method public static final task(Lkotlin/jvm/functions/Function0;)Le70;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function0<",
            "+TT;>;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lt80;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, p0, v2, v1}, Lt80;-><init>(Lkotlin/jvm/functions/Function0;Lc10;I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    sget-object v1, Ljr0;->a:Ljr0;

    .line 13
    .line 14
    invoke-static {v1, v2, v0, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static final then(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+TR;>;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->b:Ljx2;

    .line 8
    .line 9
    new-instance v1, Lny1;

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    const/4 v3, 0x0

    .line 13
    invoke-direct {v1, v2, v3, p0, p1}, Lny1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Ljr0;->a:Ljr0;

    .line 17
    .line 18
    invoke-static {p0, v0, v1, v2}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final thenAsync(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Le70;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->b:Ljx2;

    .line 8
    .line 9
    new-instance v1, Lny1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v3, v2, p0, p1}, Lny1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    sget-object p1, Ljr0;->a:Ljr0;

    .line 18
    .line 19
    invoke-static {p1, v0, v1, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final thenAsyncUi(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+",
            "Le70;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->a:Lm60;

    .line 8
    .line 9
    sget-object v0, Lgb1;->a:Lkt0;

    .line 10
    .line 11
    new-instance v1, Lny1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x4

    .line 15
    invoke-direct {v1, v3, v2, p0, p1}, Lny1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    sget-object p1, Ljr0;->a:Ljr0;

    .line 20
    .line 21
    invoke-static {p1, v0, v1, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static final thenFail(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "Ljava/lang/Exception;",
            ">;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->b:Ljx2;

    .line 8
    .line 9
    new-instance v1, Ljy1;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x3

    .line 13
    invoke-direct {v1, v3, v2, p0, p1}, Ljy1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    sget-object p1, Ljr0;->a:Ljr0;

    .line 18
    .line 19
    invoke-static {p1, v0, v1, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method

.method public static final thenUi(Le70;Lkotlin/jvm/functions/Function1;)Le70;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            "R:",
            "Ljava/lang/Object;",
            ">(",
            "Le70;",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;+TR;>;)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    sget-object v0, Lz80;->a:Lm60;

    .line 8
    .line 9
    sget-object v0, Lgb1;->a:Lkt0;

    .line 10
    .line 11
    new-instance v1, Lny1;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    const/4 v3, 0x5

    .line 15
    invoke-direct {v1, v3, v2, p0, p1}, Lny1;-><init>(ILc10;Le70;Lkotlin/jvm/functions/Function1;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    sget-object p1, Ljr0;->a:Ljr0;

    .line 20
    .line 21
    invoke-static {p1, v0, v1, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method

.method public static final withRetries(Lkotlin/jvm/functions/Function1;IJJJ)Le70;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/Exception;",
            "+",
            "Le70;",
            ">;IJJJ)",
            "Le70;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Loy1;

    .line 5
    .line 6
    const/4 v9, 0x0

    .line 7
    move-object v8, p0

    .line 8
    move v1, p1

    .line 9
    move-wide v2, p2

    .line 10
    move-wide v6, p4

    .line 11
    move-wide/from16 v4, p6

    .line 12
    .line 13
    invoke-direct/range {v0 .. v9}, Loy1;-><init>(IJJJLkotlin/jvm/functions/Function1;Lc10;)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x3

    .line 17
    sget-object p1, Ljr0;->a:Ljr0;

    .line 18
    .line 19
    const/4 p2, 0x0

    .line 20
    invoke-static {p1, p2, v0, p0}, Li13;->d(Ly10;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)Lf70;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public static synthetic withRetries$default(Lkotlin/jvm/functions/Function1;IJJJILjava/lang/Object;)Le70;
    .locals 0

    .line 1
    and-int/lit8 p9, p8, 0x2

    .line 2
    .line 3
    if-eqz p9, :cond_0

    .line 4
    .line 5
    const/16 p1, 0xa

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p9, p8, 0x4

    .line 8
    .line 9
    if-eqz p9, :cond_1

    .line 10
    .line 11
    const-wide/16 p2, 0x64

    .line 12
    .line 13
    :cond_1
    and-int/lit8 p9, p8, 0x8

    .line 14
    .line 15
    if-eqz p9, :cond_2

    .line 16
    .line 17
    const-wide/16 p4, 0x3e8

    .line 18
    .line 19
    :cond_2
    and-int/lit8 p8, p8, 0x10

    .line 20
    .line 21
    if-eqz p8, :cond_3

    .line 22
    .line 23
    const-wide/16 p6, 0x2710

    .line 24
    .line 25
    :cond_3
    move-wide p8, p6

    .line 26
    move-wide p6, p4

    .line 27
    move-wide p4, p2

    .line 28
    move-object p2, p0

    .line 29
    move p3, p1

    .line 30
    invoke-static/range {p2 .. p9}, Lcom/supercell/id/scid_plugin/PromiseUtilKt;->withRetries(Lkotlin/jvm/functions/Function1;IJJJ)Le70;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method
