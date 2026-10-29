.class public final Lap2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lap2;->a:I

    .line 5
    .line 6
    iput p2, p0, Lap2;->b:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget v0, p0, Lap2;->a:I

    .line 2
    .line 3
    iget p0, p0, Lap2;->b:I

    .line 4
    .line 5
    invoke-static {v0, p0}, Lcom/supercell/titan/VirtualKeyboardHandler;->inputSelectionChanged(II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
