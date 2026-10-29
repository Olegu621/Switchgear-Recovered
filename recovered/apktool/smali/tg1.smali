.class public final Ltg1;
.super Lk2;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Landroid/view/ActionProvider$VisibilityListener;


# instance fields
.field public b:Ler0;

.field public final c:Landroid/view/ActionProvider;


# direct methods
.method public constructor <init>(Lwg1;Landroid/view/ActionProvider;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltg1;->c:Landroid/view/ActionProvider;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onActionProviderVisibilityChanged(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Ltg1;->b:Ler0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Ler0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lsg1;

    .line 8
    .line 9
    iget-object p0, p0, Lsg1;->n:Ljg1;

    .line 10
    .line 11
    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Ljg1;->h:Z

    .line 13
    .line 14
    invoke-virtual {p0, p1}, Ljg1;->p(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
