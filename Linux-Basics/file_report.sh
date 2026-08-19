#!/bin/bash

target_dir="$1"

echo "$target_dir"

declare -A array

if [ ! -d "$target_dir" ]; then
    echo "Error: $target_dir is not a valid directory."
    exit 1
fi

for file in "$target_dir"/*; do
    if [ -f "$file" ]; then

        filename=$(basename "$file")
        extension="${filename##*.}"
        ((array["$extension"]++))
    fi
done

echo "File extensions and their counts:"

for ext in "${!array[@]}"; do
    echo "$ext: ${array[$ext]}"
done