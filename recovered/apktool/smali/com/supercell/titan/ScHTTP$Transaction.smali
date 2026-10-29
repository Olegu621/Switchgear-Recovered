.class public Lcom/supercell/titan/ScHTTP$Transaction;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/ScHTTP;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Transaction"
.end annotation


# instance fields
.field public volatile a:Lcom/supercell/titan/ScHTTP$State;


# virtual methods
.method public abort()V
    .locals 0

    .line 1
    return-void
.end method

.method public getBody()Lcom/supercell/titan/ByteSource;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getResponse()Lcom/supercell/titan/ScHTTP$Response;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getState()Lcom/supercell/titan/ScHTTP$State;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/supercell/titan/ScHTTP$Transaction;->a:Lcom/supercell/titan/ScHTTP$State;

    .line 2
    .line 3
    return-object p0
.end method

.method public run()V
    .locals 4

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 3
    :catch_0
    move-exception v1

    .line 4
    new-instance v2, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    const v0, 0x194

    const-string v3, "HTTP download failed: "

    .line 7
    .line 8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const v0, 0x195

    const-string v3, "ScHTTP"

    .line 19
    .line 20
    invoke-static {v3, v2, v1}, Lio/sentry/android/core/n0;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 21
    .line 22
    .line 23
    sget-object v1, Lcom/supercell/titan/ScHTTP$State;->FAILED:Lcom/supercell/titan/ScHTTP$State;

    .line 24
    .line 25
    iput-object v1, p0, Lcom/supercell/titan/ScHTTP$Transaction;->a:Lcom/supercell/titan/ScHTTP$State;

    .line 26
    .line 27
    return-void
.end method
