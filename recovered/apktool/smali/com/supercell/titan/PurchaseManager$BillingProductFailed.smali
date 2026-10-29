.class public Lcom/supercell/titan/PurchaseManager$BillingProductFailed;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/PurchaseManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "BillingProductFailed"
.end annotation


# instance fields
.field public errorCode:I

.field public localizedDescription:Ljava/lang/String;

.field public productID:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->productID:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/supercell/titan/PurchaseManager$BillingProductFailed;->localizedDescription:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method
