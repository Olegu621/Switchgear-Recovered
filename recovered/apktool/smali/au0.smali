.class public final Lau0;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Lra2;


# virtual methods
.method public closeHelpcenter()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event to close Helpcenter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lus0;

    .line 16
    .line 17
    const/4 v2, 0x2

    .line 18
    invoke-direct {v1, p0, v2}, Lus0;-><init>(Lra2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public getWebchatData()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event to getWCLocalStorageData from HC WebView."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lus0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, p0, v2}, Lus0;-><init>(Lra2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public hcActionSync(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event to ActionSync from HC WebView."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lvs0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, p1, v2}, Lvs0;-><init>(Lra2;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public helpcenterLoaded(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event helpcenter loaded"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lws0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, p0, p1, v2}, Lws0;-><init>(Lra2;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lvs0;

    .line 25
    .line 26
    const/4 v2, 0x2

    .line 27
    invoke-direct {v1, p0, p1, v2}, Lvs0;-><init>(Lra2;Ljava/lang/String;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public onHelpcenterError()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event helpcenter error"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lus0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, v2}, Lus0;-><init>(Lra2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lus0;

    .line 25
    .line 26
    const/4 v2, 0x4

    .line 27
    invoke-direct {v1, p0, v2}, Lus0;-><init>(Lra2;I)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public openWebchat()V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event to open Webchat"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lus0;

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    invoke-direct {v1, p0, v2}, Lus0;-><init>(Lra2;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->t(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public removeAdditionalInfo(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event to remove additional Helpcenter data from HC WebView."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lvs0;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    invoke-direct {v1, p0, p1, v2}, Lvs0;-><init>(Lra2;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setAdditionalInfo(Ljava/lang/String;)V
    .locals 3
    .annotation runtime Landroid/webkit/JavascriptInterface;
    .end annotation

    .line 1
    const-string v0, "Received event to set additional Helpcenter data from HC WebView."

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "HelpcnterToNatve"

    .line 5
    .line 6
    invoke-static {v2, v0, v1}, Lxe2;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lau0;->a:Lra2;

    .line 10
    .line 11
    iget-object v0, p0, Lra2;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lra2;

    .line 14
    .line 15
    new-instance v1, Lws0;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-direct {v1, p0, p1, v2}, Lws0;-><init>(Lra2;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lra2;->u(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
