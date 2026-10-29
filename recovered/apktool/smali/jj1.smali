.class public final synthetic Ljj1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/id/scid_plugin/MobileScannerHandler;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)V
    .locals 0

    .line 1
    iput p2, p0, Ljj1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Ljj1;->b:Lcom/supercell/id/scid_plugin/MobileScannerHandler;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Ljj1;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Ljj1;->b:Lcom/supercell/id/scid_plugin/MobileScannerHandler;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->d(Lcom/supercell/id/scid_plugin/MobileScannerHandler;I)Lkotlin/Unit;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->g(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {p0, p1}, Lcom/supercell/id/scid_plugin/MobileScannerHandler;->c(Lcom/supercell/id/scid_plugin/MobileScannerHandler;Ljava/lang/String;)Lkotlin/Unit;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
