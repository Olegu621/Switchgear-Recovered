.class final Lcom/supercell/titan/KkProgressBridge$Callback;
.super Ljava/lang/Object;
.source "KkProgressBridge.java"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/KkProgressBridge;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "Callback"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 144
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/supercell/titan/KkProgressBridge$1;)V
    .locals 0

    .line 144
    invoke-direct {p0}, Lcom/supercell/titan/KkProgressBridge$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 0

    .line 147
    invoke-static {}, Lcom/supercell/titan/KkProgressBridge;->access$200()V

    return-void
.end method

.method public run()V
    .locals 0

    .line 146
    invoke-static {}, Lcom/supercell/titan/KkProgressBridge;->access$100()V

    return-void
.end method
