// Forward declaration of isBadVersion API.
bool isBadVersion(int version);

int firstBadVersion(int n) {
	
	int left = 1;
	int right = n;
	mid = (left + right)/2;
	int firstOcc = 0;
	while(left<=right)
	{
		if(isBadVersion(mid) == 1)
		{
			firstOcc = mid;
			high = mid-1;
		}
		else if(isBadVersion(mid)<1)
			left = mid+1;
		else 
			high = mid-1;
	}
	return firstOcc;
}

