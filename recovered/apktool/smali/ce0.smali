.class public final synthetic Lce0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/supercell/id/scid_plugin/EncryptedStorage;


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/id/scid_plugin/EncryptedStorage;I)V
    .locals 0

    .line 1
    iput p2, p0, Lce0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lce0;->b:Lcom/supercell/id/scid_plugin/EncryptedStorage;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lce0;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lce0;->b:Lcom/supercell/id/scid_plugin/EncryptedStorage;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->b(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Lcom/supercell/id/scid_plugin/SecurePreferences;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    invoke-static {p0}, Lcom/supercell/id/scid_plugin/EncryptedStorage;->a(Lcom/supercell/id/scid_plugin/EncryptedStorage;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
