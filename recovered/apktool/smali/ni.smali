.class public final Lni;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/google/android/material/progressindicator/a;


# direct methods
.method public synthetic constructor <init>(Lcom/google/android/material/progressindicator/a;I)V
    .locals 0

    .line 1
    iput p2, p0, Lni;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lni;->b:Lcom/google/android/material/progressindicator/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    .line 1
    iget v0, p0, Lni;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lni;->b:Lcom/google/android/material/progressindicator/a;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/google/android/material/progressindicator/a;->f:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget v0, p0, Lcom/google/android/material/progressindicator/a;->i:I

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void

    .line 18
    :pswitch_0
    const/4 v0, 0x0

    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/material/progressindicator/a;->setIndeterminate(Z)V

    .line 20
    .line 21
    .line 22
    iget v0, p0, Lcom/google/android/material/progressindicator/a;->b:I

    .line 23
    .line 24
    invoke-virtual {p0, v0}, Lcom/google/android/material/progressindicator/a;->b(I)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    nop

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
