.class public final Lpa2;
.super Lb51;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lqa2;


# direct methods
.method public synthetic constructor <init>(Lqa2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpa2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpa2;->b:Lqa2;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Lb51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lpa2;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lpa2;->b:Lqa2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lht1;

    .line 9
    .line 10
    invoke-direct {v0, p0}, Lsq3;-><init>(Lqa2;)V

    .line 11
    .line 12
    .line 13
    return-object v0

    .line 14
    :pswitch_0
    new-instance v0, Lve1;

    .line 15
    .line 16
    invoke-direct {v0, p0}, Lsq3;-><init>(Lqa2;)V

    .line 17
    .line 18
    .line 19
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 20
    .line 21
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p0, v0, Lve1;->b:Ljava/util/LinkedHashMap;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
