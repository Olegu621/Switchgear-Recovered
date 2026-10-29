.class public final Lw30;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public a:Ljavax/inject/Provider;

.field public b:Ld1;

.field public c:Ljavax/inject/Provider;

.field public d:Lts0;

.field public e:Ljavax/inject/Provider;

.field public f:Ljavax/inject/Provider;

.field public i:Ljavax/inject/Provider;


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lw30;->f:Ljavax/inject/Provider;

    .line 2
    .line 3
    invoke-interface {p0}, Ljavax/inject/Provider;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ls52;

    .line 8
    .line 9
    invoke-virtual {p0}, Ls52;->close()V

    .line 10
    .line 11
    .line 12
    return-void
.end method
