.class public final synthetic Lyk0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/id/FlutterSupport;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/id/FlutterSupport;I)V
    .locals 0

    .line 1
    iput p2, p0, Lyk0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lyk0;->b:Lcom/supercell/id/FlutterSupport;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lyk0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lyk0;->b:Lcom/supercell/id/FlutterSupport;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/supercell/id/FlutterSupport;->h(Lcom/supercell/id/FlutterSupport;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-static {p0}, Lcom/supercell/id/FlutterSupport;->d(Lcom/supercell/id/FlutterSupport;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_1
    invoke-static {p0}, Lcom/supercell/id/FlutterSupport;->a(Lcom/supercell/id/FlutterSupport;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_2
    invoke-static {p0}, Lcom/supercell/id/FlutterSupport;->f(Lcom/supercell/id/FlutterSupport;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
