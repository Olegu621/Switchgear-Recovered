.class public final Lmx0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lr21;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lmx0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lmx0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    iget v0, p0, Lmx0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lmx0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lr;

    .line 9
    .line 10
    check-cast p0, Lkotlinx/serialization/internal/EnumDescriptor;

    .line 11
    .line 12
    invoke-direct {v0, p0}, Lr;-><init>(Lkotlinx/serialization/internal/EnumDescriptor;)V

    .line 13
    .line 14
    .line 15
    return-object v0

    .line 16
    :pswitch_0
    check-cast p0, Lq70;

    .line 17
    .line 18
    new-instance v0, Lkotlin/text/b;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Lkotlin/text/b;-><init>(Lq70;)V

    .line 21
    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_1
    new-instance v0, Lsa0;

    .line 25
    .line 26
    check-cast p0, Lod;

    .line 27
    .line 28
    iget-object p0, p0, Lod;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {p0}, Lpy0;->q0([Ljava/lang/Object;)Lr;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {v0, p0}, Lsa0;-><init>(Ljava/util/Iterator;)V

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
