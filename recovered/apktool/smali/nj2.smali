.class public final synthetic Lnj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lpn;

.field public final synthetic c:Lvg;


# direct methods
.method public synthetic constructor <init>(Lpn;Lvg;I)V
    .locals 0

    .line 1
    iput p3, p0, Lnj2;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lnj2;->b:Lpn;

    .line 4
    .line 5
    iput-object p2, p0, Lnj2;->c:Lvg;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lnj2;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Lnj2;->c:Lvg;

    .line 4
    .line 5
    iget-object p0, p0, Lnj2;->b:Lpn;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Lpn;->h(Lvg;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-virtual {p0, v1}, Lpn;->h(Lvg;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
