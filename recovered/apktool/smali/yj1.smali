.class public final Lyj1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/animation/Interpolator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr4;


# direct methods
.method public synthetic constructor <init>(Lr4;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyj1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyj1;->b:Lr4;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final getInterpolation(F)F
    .locals 2

    .line 1
    iget v0, p0, Lyj1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lyj1;->b:Lr4;

    .line 7
    .line 8
    float-to-double v0, p1

    .line 9
    invoke-virtual {p0, v0, v1}, Lr4;->a(D)D

    .line 10
    .line 11
    .line 12
    move-result-wide p0

    .line 13
    :goto_0
    double-to-float p0, p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    iget-object p0, p0, Lyj1;->b:Lr4;

    .line 16
    .line 17
    float-to-double v0, p1

    .line 18
    invoke-virtual {p0, v0, v1}, Lr4;->a(D)D

    .line 19
    .line 20
    .line 21
    move-result-wide p0

    .line 22
    goto :goto_0

    .line 23
    :pswitch_1
    iget-object p0, p0, Lyj1;->b:Lr4;

    .line 24
    .line 25
    float-to-double v0, p1

    .line 26
    invoke-virtual {p0, v0, v1}, Lr4;->a(D)D

    .line 27
    .line 28
    .line 29
    move-result-wide p0

    .line 30
    goto :goto_0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
