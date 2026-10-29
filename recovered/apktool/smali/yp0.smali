.class public final synthetic Lyp0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:J


# direct methods
.method public synthetic constructor <init>(Lcom/supercell/titan/GameApp;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p2, p0, Lyp0;->a:J

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-wide v0, p0, Lyp0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Lcom/supercell/titan/GameApp;->nRunFromUiThread(J)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
