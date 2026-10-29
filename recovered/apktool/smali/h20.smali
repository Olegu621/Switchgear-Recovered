.class public final Lh20;
.super Landroid/os/AsyncTask;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public a:Landroid/content/Context;

.field public b:Landroid/content/Intent;

.field public c:Ljava/lang/Class;


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, [Ljava/lang/String;

    .line 2
    .line 3
    iget-object p1, p0, Lh20;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v0, p0, Lh20;->b:Landroid/content/Intent;

    .line 6
    .line 7
    iget-object p0, p0, Lh20;->c:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {p1, v0, p0}, Lcom/supercell/titan/TimeAlarm;->handleLocalNotification(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method
